package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class f5 {
    public static void main(String[] args) {
        Pipe pipe = null; // Initialize the pipe variable
        try {
            pipe = Pipe.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Pipe.SinkChannel sinkChannel = pipe.sink();
        String str = "Shruti CSE406 Advance java programming";
        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(str.getBytes());
        bb.flip();
        
        while (bb.hasRemaining()) {
            try {
                sinkChannel.write(bb);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        Pipe.SourceChannel sourceChannel = pipe.source();
        bb = ByteBuffer.allocate(512);
        
        try {
            while (sourceChannel.read(bb) > 0) {
                bb.flip();
                while (bb.hasRemaining()) {
                    char sc = (char) bb.get();
                    System.out.print(sc);
                }
                bb.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
