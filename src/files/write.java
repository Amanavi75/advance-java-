package files;

// Java Program to Write Files using the New I/O (NIO.2) API
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class write {
    public static void main(String[] args) {
        Path filePath = Paths.get("example.txt");

        try {
            // Create a list of strings to be written to the file
            List<String> lines = new ArrayList<>();
            lines.add("Welcome");
            lines.add("to");
            lines.add("GeeksForGeeks");

            // Write the lines to the file
            Files.write(filePath, lines);

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
