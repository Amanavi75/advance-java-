package NIO;


import java.nio.file.*;
import java.io.*;
public class f1 {

public static void main(String args[]) throws IOException
{
Path p1=Paths.get("d:\\NIO\\ke007.txt"); // used to get path of the file
Files.delete(p1);  // 
System.out.println("file deleted.");
}
}
