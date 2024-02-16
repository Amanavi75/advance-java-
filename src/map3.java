import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee {
    int id ;
    String name;
    double salary ;

    public employee (int id, String name , double salary){
        this.id =id;
        this.name = name ;
        this.salary = salary;
    }
}

public class map3 {
    public static void main(String[] args) {
        List<employee> ep = new ArrayList<employee>();
        ep.add(new employee(1, "robbin", 52000));
        ep.add(new employee(2, "suman ", 50000));
        ep.add(new employee(3, "shivam", 55000));
        ep.add(new employee(4, "Ranjit ", 60000));
        List<String> names =  new ArrayList<>();
        names = ep.stream().filter(e->e.salary>50000).map(p->p.name).collect(Collectors.toList());
        System.out.println(names);
    }
    
}

/* using map along with the filter and collecting it using the Collector class  */
