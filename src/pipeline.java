import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class pipeline {

    public static void main (String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sinkChannel = pipe.sink();
        String str = "aman advance kjava ";
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(str.getBytes());
        bb.flip();
        while(bb.hasRemaining()){
            sinkChannel.write(bb);
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        bb = ByteBuffer.allocate(512);

        while(sourceChannel.read(bb)>0){
 
            bb.flip();
            while(bb.hasRemaining()){
                char sc = (char)bb.get();
                System.out.println(sc);
            }

            bb.clear();
        }
    }
    
}