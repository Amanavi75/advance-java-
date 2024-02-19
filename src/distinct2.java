import java.util.*;
import java.util.Arrays;

class distinct2
{
public static void main(String shruti[])
{
List<Integer> ls=Arrays.asList(5,6,1,2,4,8,9,3,3);
long c=ls.stream()
.filter(e->e%2!=0).distinct().count();
System.out.println("Odd number in stream are:- " + c);
}
}