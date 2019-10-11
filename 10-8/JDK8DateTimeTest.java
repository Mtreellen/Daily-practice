package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author mtreellen
 * @create 2019-10-08-19:46
 */
public class JDK8DateTimeTest {
    public static void main(String[] args) {
//        test();
        test1();
    }
    public static void test(){
        /*
        //偏移量
        Date date = new Date(2019,10,9);
        System.out.println(date);//Sun Nov 09 00:00:00 CST 3919

        Date date1 = new Date(2019 - 1990, 10 - 1, 9);
        System.out.println(date1);//Wed Oct 09 00:00:00 CST 1929
        */
    }
    public static void test1(){
        //now()
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);//2019-10-09
        System.out.println(now1);//19:56:26.907
        System.out.println(now2);//2019-10-09T19:56:26.907

        //of()   ---  无偏移量
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 1, 13, 12, 28);
        System.out.println(localDateTime);//2020-10-01T13:12:28

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());//1
        System.out.println(localDateTime.getDayOfWeek());//THURSDAY
        System.out.println(localDateTime.getDayOfYear());//275
        System.out.println(localDateTime.getMinute());//12

        LocalDate localDate = LocalDate.of(2020,10,1);
        System.out.println(localDate);//2020-10-01
        System.out.println(localDate.withDayOfMonth(22));//2020-10-22

        //plusXxx()
        System.out.println(localDate);//2020-10-01
        System.out.println(localDate.plusMonths(1));//2020-11-01

        //minusXxx()
        System.out.println(localDateTime);//2020-10-01T13:12:28
        System.out.println(localDateTime.minusHours(3));//2020-10-01T10:12:28
    }
}
