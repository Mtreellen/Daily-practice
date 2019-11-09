package string;

import java.util.Arrays;

/**
 * @author mtreellen
 * @create 2019-11-09 15:10
 * 字符串
 */
public class StringTest1 {
    public static void test(){
        String[] arr = new String[]{"AA", "AA", "AA"};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "CC";//直接修改哦！！！
        }
        System.out.println(arr.toString());//[Ljava.lang.String;@1b6d3586
        System.out.println(Arrays.toString(arr));//[CC, CC, CC]

        for(String s : arr){
            s = "BB";//新的变量哦！！！
            System.out.print(s + " ");//BB BB BB
        }
        System.out.println("\n" + Arrays.toString(arr));//[CC, CC, CC]
    }

    public static void main(String[] args) {
//        test();
//        test1();
        test2();
//        test3();
//        test4();
//        test5();
//        test6();
    }

    /**
     * 创建字符串
     */
    public static void test0(){
        // 直接赋值
        String str1 = "abcde";
        // 构造方法
        String str2 = new String("abcde");// str2 != str1

        String str3 = str1;// str1 == str3
        String str4 = "abcde"; // str4 == str1
    }

    public static void test1(){
        String str1 = "abcde";

        // 两个字符串常量直接拼接，编译期间就处理为拼接的结果
        String str2 = "abc" + "de";
        System.out.println(str1 == str2);//true

        String str3 = "a" + new String("bcde");
        System.out.println(str1 == str3);// false
        System.out.println(str1.equals(str3));// true

        /**
         * 变量在编译时不知道其具体值；
         * 常量在编译时就确定了值
         */
        String str4 = "ab";
        String str5 = "cde";
        String str6 = str4 + str5;
        System.out.println(str6 == str1);// false

        String str7 = str4 + "cde";
        System.out.println(str7 == str1);// false
    }

    /**
     * 当 final 修饰 String类型变量后
     */
    public static void test2(){
        String str1 = "abcde";
        final String str2 = "ab";
        final String str3 = "cde";

        final String str4 = new String("abcde");
        System.out.println(str1 == str4);// false

        final String str5 = "abcde";
        System.out.println(str1 == str5);// true

        // 两个字符串常量直接拼接，编译期间就处理为拼接的结果
        String str6 = str2 + str3;
        System.out.println(str6 == str1);// true
        String str7 = str2 + "cde";
        System.out.println(str7 == str1);// true

        String str8 = str1 + "f";
        String str9 = str4 + "f";
        System.out.println(str8 == str9);// false

        String str10 = "abcdef";
        System.out.println(str8 == str10);// false
    }

    /**
     * 与其他类型的 常量 进行 + 的操作
     */
    public static void test3(){
        // 常量在编译期间就处理
        String str1 = "abc10";
        String str2 = "abc" + 10;
        System.out.println(str1 == str2);// true
    }

    /**
     * 字符串手工入池
     */
    public static void test4(){
        /**
         * intern():String
         * native方法（C++）
         */
        String str1 = "Hello";
        String str2 = new String("Hello").intern();
        System.out.println(str1 == str2);// true

        String str3 = new String("hehe").intern();
        String str4 = "hehe";
        System.out.println(str3 == str4);

        String str5  = new String("hehe");
        str5.intern();
        System.out.println(str5 == str4);// false
        String str6 = str5.intern();
        System.out.println(str6 == str4);// true
    }


    public static void test6(){
        String str1 = "abc";
        String str2 = "a";
        String str3 = "bc";
        String str4 = str1 + str2;
        System.out.println(str1 == str3);
    }
    /**
     * 练习: 字符串 —> 字节数组
     * 调用String类的 getBytes() 方法
     */
    public final static void fun(){

    }
    public final static void fun(int a){

    }
}
