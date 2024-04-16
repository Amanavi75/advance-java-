import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;
public class formatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("before formating"+now);
        System.out.println(now.plusDays(10));
        System.out.println(now.minusDays(20));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy  mm:hh:ss");
        String formatDateTime = now.format(format);
        System.out.println(formatDateTime);

    }
    
}
