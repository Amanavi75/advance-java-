package local;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class lo5 {
    static void printTime(Locale locale){
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date currentDate = new Date();
        String date = formatter.format(currentDate);
        //System.out.println(time + " in particular date Locale "+locale);
        System.out.println(date+ "  in particular date Locale "+locale);

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
