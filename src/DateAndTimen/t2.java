package DateAndTimen;

import java.time.LocalDate;
import java.time.LocalTime;


public class t2 {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.of(2024,05, 4);

        LocalDate ld2 = LocalDate.ofEpochDay(1000);

        System.out.println(l1);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(14, 05);

        System.out.println(lt1);


    }
    
}
