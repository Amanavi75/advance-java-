package files;
// Java Program to Read Files using the New I/O (NIO.2) API 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class read {
    public static void main(String[] args) {
        // Define the path to the file
        Path filePath = Paths.get("example.txt");

        try {
            // Read all lines from the file into a list
            List<String> lines = Files.readAllLines(filePath);

            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
