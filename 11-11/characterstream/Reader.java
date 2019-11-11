package characterstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ellen
 * @date 2019-11-11 17:04
 * @description：java.io.Reader:字符输入流(抽象类)
 *       是字符输入流的最顶层的父类,定义了一些共性的成员方法
 *
 *     共性的成员方法:
 *         int read() 读取单个字符并返回。
 *         int read(char[] cbuf)一次读取多个字符,将字符读入数组。
 *         void close() 关闭该流并释放与之关联的所有资源。
 *
 *     java.io.FileReader extends InputStreamReader extends Reader
 *          FileReader:文件字符输入流
 *          作用:把硬盘文件中的数据以字符的方式读取到内存中
 *
 *     构造方法:
 *         FileReader(String fileName)
 *         FileReader(File file)
 *         参数:读取文件的数据源
 *             String fileName:文件的路径
 *             File file:一个文件
 *         FileReader构造方法的作用:
 *             1.创建一个FileReader对象
 *             2.会把FileReader对象指向要读取的文件
 *     字符输入流的使用步骤:
 *         1.创建FileReader对象,构造方法中绑定要读取的数据源
 *         2.使用FileReader对象中的方法read读取文件
 *         3.释放资源
 */
public class Reader {
    public static void main(String[] args) {
        test();
//        test1();
    }
    public static void test(){
        FileReader fr = null;
        try {
            // 创建FileReader对象,构造方法中绑定要读取的数据源
            fr = new FileReader("c.txt");
            // 使用FileReader对象中的方法read读取文件
            int len = 0;
            while((len = fr.read()) != -1){
                System.out.println((char)len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    // 释放资源
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void test1(){
        /*
            在jdk1.7之前使用try catch finally 处理流中的异常
            格式:
                try{
                    可能会产出异常的代码
                }catch(异常类变量 变量名){
                   异常的处理逻辑
                }finally{
                    一定会指定的代码
                    资源释放
                }
        */
        //提高变量fw的作用域,让finally可以使用
        //变量在定义的时候,可以没有值,但是使用的时候必须有值
        //fr = new FileWriter("c.txt"); 执行失败,fw没有值,fw.close会报错
        FileReader fr = null;
        try {
            // 创建FileReader对象,构造方法中绑定要读取的数据源
            fr = new FileReader("c.txt");
            // 使用FileReader对象中的方法read读取文件
            int len = 0;//记录的是每次读取的有效字符个数
            char[] chars = new char[1024];//存储读取到的多个字符
            while((len = fr.read(chars)) != -1){
                /*
                    String类的构造方法
                    String(char[] value) 把字符数组转换为字符串
                    String(char[] value, int offset, int count) 把字符数组的一部分转换为字符串 offset数组的开始索引 count转换的个数
                */
                System.out.print(new String(chars, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //一定会执行的代码
            //创建对象失败了,
            // fr的默认值就是null,null是不能调用方法的,会抛出NullPointerException,需要增加一个判断
            // 不是null在把资源释放
            if(fr != null) {
                try {
                    // 释放资源
                    //fr.close方法声明抛出了IOException异常对象
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
