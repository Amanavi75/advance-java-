
import java.util.List;
import java.util.Arrays;
class peak
{
public static void main(String args[])
{
List<Double> ls=Arrays.asList(67.90,12.78,89.87,723.879,2.9999);
ls.stream().peek(System.out::println).count();
//.collect(Collectors.toList()); if count() is not working
}
}