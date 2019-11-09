package string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author mtreellen
 * @date 2019-11-09 20:30
 * @description 字符串方法练习
 */
public class StringMethodTest {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
        try {
            test4();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    /**
     *  char[] -> String
     * String 的构造方法String(char[] value)
     * 或者：public String(char value[], int offset, int count)
     */
    public static void test(){
        // String构造方法将字符数组转换为字符串
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String str1 = new String(chars);
        System.out.println(str1);

        // offset : 偏移量
        // 从偏移量 offset 位置开始(包括offset下标的字符)的 count 个字符构成字符串 str2
        // 运行时异常 ： StringIndexOfBoundsException
        String str2 = new String(chars,2, 2);
        System.out.println(str2);// "cd"
    }

    /**
     *  获得字符串指定位置的一个字符
     *  通过String类定义的 charAt()方法
     *  public char charAt(int index)
     *  下标 index 越界抛出异常：StringIndexOfBoundsException
     */
    public static void test1(){
        String s = "1234567";
        char ch = s.charAt(1);
        System.out.println(ch);// 2

//        System.out.println(s.charAt(7));// StringIndexOutOfBoundsException
    }

    /**
     * bytes[] ->  String
     * String的构造方法：public String(byte bytes[])
     * 或者：public String(byte bytes[], int offset, int length)
     */
    public static void test2(){
        // 构造方法将字节数组转换为字符串
        System.out.println("=============String(byte[] bytes)===============");
        byte[] bytes = {'1', '2', '3', '4'};
        String str1 = new String(bytes);
        System.out.println(str1);// 1234

        System.out.println("==============一个奇怪的现象==============");
        byte[] bytes1 = {1, 2, 3, 4};
        String str2 = new String(bytes1);
        System.out.print(str2);// 不会报错，什么也不输出
        System.out.println("++++++");// 证明却是打印了东西

        System.out.println("==============String(byte bytes[], int offset, int length)==============");
        // 从下标 2 开始，长度为 2
        String str3 = new String(new byte[]{'a', 'b', 'c', 'd'}, 2, 2);
        System.out.println(str3);//"cd"
        byte[] bytes2 = new byte[]{'a', 'b', 'c', 'd'};
        String str4 = new String(bytes2, 2, 2);
        System.out.println(str4);//"cd"

        System.out.println("========================");
        byte[] bytes3 = {97, 98, 99, 100};// 存放 ASCII 码值
        String str5 = new String(bytes3);
        System.out.println(str5);//abcd
    }

    /**
     * String -> char[]
     * String类中的：public char[] toCharArray()
     */
    public static void test3(){
        String str = "abcdef";
        char[] chars = str.toCharArray();
        System.out.println(chars);// char[] 可以不用Arrays.toString()的原因：j
                                    // ava.io.PrintStream#println(char[])
    }
    /**
     * String -> byte[]
     * String类中的 ：public byte[] getBytes(String charsetName) throws UnsupportedEncodingException{}
     *                  public byte[] getBytes(Charset charset){}
     */
    public static void test4() throws UnsupportedEncodingException {
        String str = "1234567";
        byte[] bytes = str.getBytes();// 转换为 对应的 ASCII 码值
        System.out.println(Arrays.toString(bytes));// [49, 50, 51, 52, 53, 54, 55]
        System.out.println(Arrays.toString("1234567".getBytes()));// [49, 50, 51, 52, 53, 54, 55]

        System.out.println("=================getBytes(String charsetName)====================");
        String str1 = "中国";
        byte[] bytes1 = str1.getBytes("utf-8");
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = str1.getBytes("gbk");
        System.out.println(Arrays.toString(bytes2));
        byte[] bytes3 = str1.getBytes("unicode");
        System.out.println(Arrays.toString(bytes3));
    }
}
class StringMethod1{
    public static void main(String[] args) {
//        testCompareTo();
//        testContains();
        testIndexOf();
    }
    /**
     * 字符串比较
     * 看源码
     * compareTo()
     * public int compareTo(String anotherString) {
     */
    public static void testCompareTo(){
        String str = "AAB";
        String str1 = "AABBBB";
        System.out.println(str.compareTo(str1));
    }

    /**
     * 字符串是否包含
     *  contains()
     *  public boolean contains(CharSequence s)
     *  向上转型 : String 类实现了 CharSequence 接口
     */
    public static void testContains(){
        System.out.println("Hello".contains("llo"));
    }
    /**
     * 字符串包含返回下标
     * 返回指定范围内第一次出现的下标
     * indexOf() 比 contains() 高效
     * public int indexOf(String str)
     * public int indexOf(String str, int fromIndex)
     */
    public static void testIndexOf(){
        System.out.println("HelloHelloHello".indexOf("llo"));// 2
        // [
        System.out.println("你好啊ellen，很高兴认识你".indexOf("你", 0));// 0

        System.out.println("吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮"
                .lastIndexOf("葡萄"));// 15

        System.out.println("吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮"
                .lastIndexOf("葡萄", 8));// 5
    }

}