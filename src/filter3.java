import java.util.*;
class employee{
int empid;
String empname;
int empsal;
char gender;
employee(int id,String name,int sal,char gen)
{
empid=id;
empname=name;
empsal=sal;
gender=gen;
}
}
class filter3
{
public static void main(String shruti[])
{
ArrayList<employee> ar=new ArrayList<>();
ar.add(new employee(1,"Shruti",16000,'F'));
ar.add(new employee(2,"Om",16000,'M'));
ar.add(new employee(3,"Ruchika",18000,'F'));
ar.add(new employee(4,"Yash",14000,'M'));
ar.add(new employee(5,"Neha",13000,'F'));
ar.stream()
.filter(x-> x.empsal>15000 && x.empsal<30000 && x.gender=='F')
.forEach(s-> System.out.println(s.empname));
}
}