package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class f4 {
    public static void main(String[] args) {
        Path p=Paths.get("D:\\ke007");
System.out.println(p.getRoot());
try {
Stream<Path> str=Files.list(p);
str.forEach(x->
{ String name=x.getFileName().toString();
String token[]=name.split("\\.");
String extension=token[token.length-1];
try{
//Path d=Paths.get(x.getParent()+"\\"+extension);
Path d=Paths.get(extension);
Files.createDirectory(d);
}
catch(Exception e){
System.out.println(e);
}
});
}
catch(Exception e) {
e.printStackTrace();}
    }
    
}
