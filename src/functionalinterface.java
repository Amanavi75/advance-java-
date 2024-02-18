@FunctionalInterface
interface Hotel
{
public void order();
}
class LambdaKe007
{
public static void main(String args[])
{
String item="Tea";
Hotel H1= () ->{
System.out.println("My order is :- "+item);
};
H1.order();
}
}