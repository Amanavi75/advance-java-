import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
class filter5
{
public static void main(String args[])
{
Integer arr[]={3,11,5,65,1,23,407,9};
Stream<Integer> str=Arrays.stream(arr);
Optional<Integer> op=str.filter(x->x%2==0).max((a,b)->a.compareTo(b));
//op.ifPresent(x->System.out.println(x));

if(op.isPresent()){
System.out.println(op.get());
}else{
System.out.println("No element found");
}
}
}