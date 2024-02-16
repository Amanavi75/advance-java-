
import java.util.Arrays;
import java.util.List;

public class distinct {

    public static void main(String[] args) {
        List<String>ls = Arrays.asList("bus","bus","car","truck","motorcycle");
        // distinct
        ls.stream().distinct().forEach(e->System.out.println(e));

        //count
        long count = ls.stream().count();
        System.out.println(count);

        
    }
    
}
