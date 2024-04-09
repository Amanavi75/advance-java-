import java.time.LocalDate;
/**
 * date
 */
public class date {
public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);

    LocalDate yesterday = date.minusDays(1);
    System.out.println(yesterday);

    LocalDate tomorrow = date.plusDays(1);
    System.out.println(tomorrow);

    System.out.println(date.getDayOfYear());
    System.out.println(date.isLeapYear());
    
}
    
}