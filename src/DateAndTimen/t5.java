package DateAndTimen;

import java.time.LocalDate;

public class t5 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
System.out.println("Today's date is :- " + date);
LocalDate yesterday=date.minusDays(1);
System.out.println("Yesterday's date was :- " + yesterday);
LocalDate tommorow=date.plusDays(1);
System.out.println("Tommorow's date will be :- " + tommorow);
System.out.println(date.getYear());
System.out.println(date.isLeapYear());
System.out.println(date.getMonth());
System.out.println(date.getMonthValue());
System.out.println(date.getDayOfMonth());
System.out.println(date.plusMonths(2));
LocalDate date1=LocalDate.of(2014,10,14);
System.out.println(date1.getDayOfWeek());
System.out.println(date1.lengthOfYear());
System.out.println(date1.lengthOfMonth());
System.out.println(date1.getDayOfYear());
String str="2021-10-09";
LocalDate date2=LocalDate.parse(str);
System.out.println("Showing date by parse method:- "+ date2);
    }
}
