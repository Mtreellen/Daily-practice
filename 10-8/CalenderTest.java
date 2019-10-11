package dateapi;

import java.util.Calendar;
import java.util.Date;

/**
 * @author mtreellen
 * @create 2019-10-08-19:26
 */
public class CalenderTest {
    public static void main(String[] args) {
//        test();
        test1();
    }
    public static void test(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//class java.util.GregorianCalendar
    }
    public static void test1(){
        Calendar calendar = Calendar.getInstance();
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);//9
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//22
        //add()
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//24

        //减的效果
        calendar.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//22

        //getTime()：日历类 --》  Date
        Date time = calendar.getTime();
        System.out.println(time);

        //setTime()：Date  --》  日历类
        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
