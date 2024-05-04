package DateAndTimen;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class t1 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();

    LocalDateTime dt =LocalDateTime.of(date,time );

    System.out.println(time);
    System.out.println(date);

    System.out.println(dt);

        
    }
    
    
    
}
