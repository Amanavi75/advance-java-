import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        List<Integer> stringList = Arrays.asList(1,2,3,4,5,6,7,8);

        
       Optional<Integer> reduced=stringList.stream().reduce((value,combinedValue)->{
            return combinedValue+ value;
        });

        System.out.println(reduced.get());

        

    } 
    
    
}
