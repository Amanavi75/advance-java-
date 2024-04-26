package local;
import java.text.DateFormat;
import java.util.*;

public class lo4 {
    static void printTime(Locale locale){
        DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        Date currentDate = new Date();
        String time = formatter.format(currentDate);
        System.out.println(time + "in particular date Locale "+locale);

    }
    public static void main(String[] args) {
        printTime(Locale.UK);
        printTime(Locale.US);
        printTime(Locale.FRANCE);
        printTime(Locale.GERMANY);
        printTime(Locale.ITALIAN);
        printTime(Locale.CHINA);
    }
    
}
