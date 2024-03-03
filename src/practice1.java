import java.util.*;
public class practice1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = scn.nextInt();

        if(a%5==0 && a%3==0){

            System.out.println("fizzBuzz");
        }else if (a%3==0) {
            System.out.println("fizz");
        }else if(a%5==0){
            System.out.println("buzz");
        }else {
            System.out.println(a);
        }
    }
}
