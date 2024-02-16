import java.util.Arrays;
import java.util.List;

public class map2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car","bus","bicycle","auto","flight");

        vehicles.stream().map(m->m.length()).forEach(n->System.out.println());


    }
    
}
