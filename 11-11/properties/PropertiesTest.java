package properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author ellen
 * @date 2019-11-11 20:03
 * @description：属性集
 * java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 *     Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
 *     Properties集合是一个唯一和IO流相结合的集合
 *         可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
 *         可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
 *
 *     属性列表中每个键及其对应值都是一个字符串。
 *         Properties集合是一个双列集合,key和value默认都是字符串
 */
public class PropertiesTest {
    public static void main(String[] args) {
//        test();
//        try {
//            test1();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            test2();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        test3();
        test4();
    }

    /**
     * 使用Properties集合存储数据,遍历取出Properties集合中的数据
     *         Properties集合是一个双列集合,key和value默认都是字符串
     *         Properties集合有一些操作字符串的特有方法
     *             Object setProperty(String key, String value)
     *                  调用 Hashtable 的方法 put。
     *             String getProperty(String key)
     *                  通过key找到value值,此方法相当于Map集合中的get(key)方法
     *             Set<String> stringPropertyNames()
     *                  返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
     */
    public static void test(){
        Properties properties = new Properties();

        properties.setProperty("Monica", "170");
        properties.setProperty("Rose", "187");
        properties.setProperty("Rachel", "174");

        //使用stringPropertyNames把Properties集合中的键取出,存储到一个Set集合中
        Set<String> set = properties.stringPropertyNames();
        //遍历Set集合,取出Properties集合的每一个键
        for (String key : set){
            //使用getProperty方法通过key获取value
            String value = properties.getProperty(key);
            System.out.println(key + " " + value);
        }
    }
    /**
     * 使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
     *         void store(OutputStream out, String comments)
     *         void store(Writer writer, String comments)
     *         参数:
     *             OutputStream out:字节输出流,不能写入中文
     *             Writer writer:字符输出流,可以写中文
     *             String comments:注释,用来解释说明保存的文件是做什么用的
     *                     不能使用中文,会产生乱码,默认是Unicode编码
     *                     一般使用""空字符串
     *
     *         使用步骤:
     *             1.创建Properties集合对象,添加数据
     *             2.创建字节输出流/字符输出流对象,构造方法中绑定要输出的目的地
     *             3.使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
     *             4.释放资源
     */
    public static void test1() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("Monica", "170");
        properties.setProperty("Rose", "187");
        properties.setProperty("Rachel", "174");

        FileWriter fw = new FileWriter("prop.txt");
        properties.store(fw, "sava data");

        fw.close();
    }
    public static void test2() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("Monica", "170");
        properties.setProperty("Rose", "187");
        properties.setProperty("瑞秋", "174");// 乱码

        properties.store(new FileOutputStream("prop1.txt"), "");
    }
    /**
     * 使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
     *         void load(InputStream inStream)
     *         void load(Reader reader)
     *         参数:
     *             InputStream inStream:字节输入流,不能读取含有中文的键值对
     *             Reader reader:字符输入流,能读取含有中文的键值对
     *         使用步骤:
     *             1.创建Properties集合对象
     *             2.使用Properties集合对象中的方法load读取保存键值对的文件
     *             3.遍历Properties集合
     *         注意:
     *             1.存储键值对的文件中,键与值默认的连接符号可以使用 = ,空格(其他符号)
     *             2.存储键值对的文件中,可以使用 # 进行注释,被注释的键值对不会再被读取
     *             3.存储键值对的文件中,键与值默认都是字符串,不用再加引号
     */
    public static void test3() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("prop.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> set = properties.stringPropertyNames();
        for(String key : set){
            String property = properties.getProperty(key);
            System.out.println(key + " " + property);
        }
    }
    public static void test4() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("prop.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> set = properties.stringPropertyNames();
        for(String key : set){
            String property = properties.getProperty(key);
            System.out.println(key + " " + property);
        }
    }
}
