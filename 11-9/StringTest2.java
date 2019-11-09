package string;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-09 19:05
 * @description 字符创不可变性
 */
public class StringTest2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        test();
//        test1();
        test3();
    }
    public static void test(){
        String str1 = "abc";
        String str2 = "a";
        String str3 = "bc";

        String str4 = str2 + str3;
        String str5 = "abc";

        System.out.println(str5 == str1);// true
        System.out.println(str4 == str1);// false
        System.out.println(str4 == str5); //false

        System.out.println(Integer.toHexString(str1.hashCode()));// 17862
        System.out.println(Integer.toHexString(str4.hashCode()));// 17862
        System.out.println(Integer.toHexString(str5.hashCode()));// 17862


        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);

        System.out.println(Integer.toHexString(s1.hashCode()));// 17862
        System.out.println(Integer.toHexString(s2.hashCode()));// 17862
    }

    /**
     * String类重写了 hashCode()，得到的不再是地址值
     */
    public static void testHashCode(){
        System.out.println("ABCDEa123abc".hashCode());  // 165374702
        System.out.println("ABCDFB123abc".hashCode()); //  165374702
    }
    public static void test1(){
        String str = "hello";
        System.out.println(Integer.toHexString(str.hashCode()));// 5e918d2
        str = "H" + str.substring(1);
        System.out.println(str);// Hello
        System.out.println(Integer.toHexString(str.hashCode()));// 42628b2
    }

    public static void test2(){
        String str = "hello";
        str += " hello";
        str += "!!!";
        System.out.println(str);
    }

    /**
     * 通过 反射 修改字符串的值
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void test3() throws NoSuchFieldException, IllegalAccessException {
        String str = "hello";
        Class clc = String.class;
        Field value = clc.getDeclaredField("value");
        value.setAccessible(true);
        char[] chars = (char[])value.get(str);
        System.out.println(Arrays.toString(chars));
        System.out.println(chars);
        chars[0] = 'H';
        System.out.println(Arrays.toString(chars));
        System.out.println(chars);
        System.out.println(str);
    }

    /**
     * 会产生大量的临时对象，影响效率
     */
    public static final void test4(){
        String str = "";
        for (int i = 1; i < 1000; i++) {
            str += i;
        }
        System.out.println(str);
    }

}
