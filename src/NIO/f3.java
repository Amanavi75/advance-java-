package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class f3 {

    public static void main(String[] args) {
        
  
    try
{
Path p1=Paths.get("d:\\ke007\\secondfile.doc");
Path p2=Files.createFile(p1);
Path p3=Paths.get("d:\\ke007\\firstfile.txt");
List<String> data=Files.readAllLines(p3);
Files.write(p2,data);
System.out.println("file created and content updated also");
}
catch(Exception e)
{
e.printStackTrace();
}
} }
