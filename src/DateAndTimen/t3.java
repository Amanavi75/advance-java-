package DateAndTimen;

import java.time.LocalTime;
import java.time.ZoneId;

public class t3 {
public static void main(String args[]) {
LocalTime time1=LocalTime.of(10,45,20);
System.out.println(time1);
LocalTime time2=LocalTime.now();
System.out.println("Current time:- "+time2);
System.out.println(time2.getHour());
System.out.println(time2.getMinute());
System.out.println(time2.getSecond());
System.out.println(time2.getNano());
LocalTime time3=time2.minusHours(2);
System.out.println(time3);
LocalTime time4=time2.minusMinutes(20);
System.out.println(time4);
System.out.println(time4.plusHours(5));
System.out.println(time4.plusMinutes(10));
ZoneId zone=ZoneId.of("Asia/Kolkata");
LocalTime time5=LocalTime.now(zone);
System.out.println(time5);
}
}