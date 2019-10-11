package dateapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * jdk8之前
 * @author mtreellen
 * @create 2019-10-08-21:05
 */
public class DateTimeTest {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();
    }
    public static void test(){
        long time = System.currentTimeMillis();
        System.out.println(time);//1970-1-1-0-0-0
    }
    public static void test1(){
        Date date = new Date();
        System.out.println(date.toString());//Tue Oct 08 23:07:12 CST 2019
        System.out.println(date.getTime());
    }
    public static void test2(){
        Date date = new Date(2019, 4, 4);
        Date date1 = new Date(1570547232924L);
        System.out.println(date1.toString());
    }
    public static void test3(){
        java.sql.Date date = new java.sql.Date(1570547232924L);
        System.out.println(date);//2019-10-08
    }
    //java.util.date -->   java.sql.date
    public static void test4(){
        Date date = new Date(12344564756874L);
//        java.sql.Date date1 = (java.sql.Date)date;//java.lang.ClassCastException
        java.sql.Date date2 = new java.sql.Date(date.getTime());
    }
    /*
    SimpleDateFormat
    1.格式化  ：  日期 --> 字符串
    2.解析 - 格式化的逆过程
     */
    public static void test5(){
        //实例化
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);//Wed Oct 09 15:23:43 CST 2019
        String format = sdf.format(date);
        System.out.println(format);//19-10-9 下午3:23

        String str = "2019-10-9";
        Date parse = null;
        try {
            parse = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
    }
    public static void test6(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);//02019.十月.09 公元 03:30 下午
        System.out.println(sdf.format(date));//02019.十月.09 公元 03:30 下午
    }
    public static void test7(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);//2019-10-09 03:33:05
        Date date1 = null;
        //解析
        try {
            date1 = sdf.parse("2019-10-09 03:33:05");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);//Wed Oct 09 03:33:05 CST 2019
    }
    //将字符串“2020-09-08”转换为java.sql.Date
    public static void test8(){
        String str = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);//Tue Sep 08 00:00:00 CST 2020
        java.sql.Date date1 = new java.sql.Date(parse.getTime());
        System.out.println(date1);//2020-09-08
    }
}
