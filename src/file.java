import java.nio.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class file {
    public static void main(String[] args) {
        try {
            System.out.println("Started:=" + new Date());
            Path source = Paths.get("C:\\Users\\hp\\Desktop\\copied.txt");
            Path destination = Paths.get("C:\\Users\\hp\\Desktop\\New folder\\copy.txt");

            Files.copy(source, destination);
            System.out.println("file transffer time"+ new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
