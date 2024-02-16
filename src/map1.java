
import java.util.Arrays;
import java.util.List;


public class map1 {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car","bus","bicycle","auto","flight");

        //List<String>ls = new ArrayList<>();

        // for (String e : vehicles) {
        //    e = e.toUpperCase();
        //    ls.add(e);
        // }

        // System.out.println(ls);

        /* traditional method using loop */


        vehicles.stream().map(name->name.toUpperCase()).forEach(n ->System.out.println(n));
    }
}