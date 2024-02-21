import java.util.*;
import java.util.stream.*;
class homeproduct
{
String name;
int quantity;
float cost;
homeproduct(String name,int quantity,int cost)
{
this.name=name;
this.quantity=quantity;
this.cost=cost;
}
}
class map4
{
public static void main(String shruti[])
{
ArrayList<homeproduct> al=new ArrayList<>();
al.add(new homeproduct("Washing machine",1,16000));
al.add(new homeproduct("Heater",1,1100));
al.add(new homeproduct("Television",1,18000));
al.add(new homeproduct("Refrigrator",1,19000));
al.add(new homeproduct("AC",1,14000));
Stream<homeproduct> str=al.stream();
float budget=str.map(product->product.cost)
.reduce(0.0f,(sum,cost)->sum+cost);
//.reduce(0.0f,Float::sum);
System.out.println("Total cost is:- "+ budget);
}
}