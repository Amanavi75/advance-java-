import java.util.ArrayList;
import java.util.List;

class product {
    int id;
    String  name ;
    double price ;
    
    
    public product (int id , String name , double price){
    
        this.id = id;
        this.name = name;
        this.price = price;

    }

}

public class filter2 {

    public static void main(String[] args) {
        List<product>p1 = new ArrayList<product>();

        p1.add(new product(1, "key", 4000));
        p1.add(new product(2, "hp", 40000));
        p1.add(new product(3, "dell", 45000));
        p1.add(new product(4, "apple", 90000));

        p1.stream().filter(n->n.price>40000).forEach(s->System.out.println(s.name));

    }
    
}

//applying it on the  custom classes 

