package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class f2 {
    public static void main(String[] args) {
        try
{
Path p1=Paths.get("d:\\ke007");
if(Files.exists(p1))
{
System.out.println("Directory already exist");
}
else
{
Path p2=Files.createDirectory(p1);
System.out.println("Directory created at :- " +p2);
}
}
catch(Exception e) {
System.out.println(e);
}
    }
    
}
