
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
class student
{
String name;
int score;
student(String name,int score)
{
this.name=name;
this.score=score;
}
public String getName(){
return this.name;
}
public int getScore()
{
return this.score;
}
}
class parallelstream
{
public static void main(String... shruti)
{
System.out.println("-----Sequential Stream-------");
IntStream s=IntStream.rangeClosed(1,10);
s.forEach(System.out::println);

System.out.println("-----Parallel Stream-------");
IntStream s1=IntStream.rangeClosed(1,10);
s1.parallel().forEach(System.out::println);

List<student> l=Arrays.asList(
new student("Shruti",57),
new student("sumit",27),
new student("tejas",37),
new student("yash",47),
new student("harshit",67),
new student("neha",77),
new student("Seema",58),
new student("Sonia",98),
new student("mohan",88)
);
System.out.println("-----Sequential collection Stream-------");
Stream<student> str=l.stream().filter(e->e.getScore()>50);
str.forEach(y->System.out.println(y.getName()+"\t"+y.getScore()));

System.out.println("-----Parallel collection Stream-------");
Stream<student> str1=l.parallelStream().filter(e->e.getScore()>50);
str1.forEach(t->System.out.println(t.getName()+"\t"+t.getScore()));

System.out.println("-----converstion from seq. to parallel collection Stream-------");
Stream<student> str2=l.stream().parallel().filter(e->e.getScore()>50).limit(3);
str2.forEach(u->System.out.println(u.getName()+"\t"+u.getScore()));

}
}
