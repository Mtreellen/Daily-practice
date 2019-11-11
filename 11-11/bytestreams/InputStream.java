package bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author ellen
 * @date 2019-11-11 15:54
 * @description：java.io.InputStream:字节输入流(抽象类)
 *     此抽象类是表示字节输入流的所有类的超类。
 *
 *     定义了所有子类共性的方法:
 *          int read()从输入流中读取数据的下一个字节。
 *          int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *          void close() 关闭此输入流并释放与该流关联的所有系统资源。
 *
 *     java.io.FileInputStream extends InputStream
 *     FileInputStream:文件字节输入流
 *     作用:把硬盘文件中的数据,读取到内存中使用
 *
 *     构造方法:
 *         FileInputStream(String name)
 *         FileInputStream(File file)
 *         参数:读取文件的数据源
 *             String name:文件的路径
 *             File file:文件
 *         构造方法的作用:
 *             1.会创建一个FileInputStream对象
 *             2.会把FileInputStream对象指定构造方法中要读取的文件
 *
 *     读取数据的原理(硬盘-->内存)
 *         java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 *
 *     字节输入流的使用步骤(重点):
 *         1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *         2.使用FileInputStream对象中的方法read,读取文件
 *         3.释放资源
 */
public class InputStream {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
        copy();
//        test3();
    }
    public static void test(){
        // 创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("b.txt");
            // 使用FileInputStream对象中的方法read,读取文件
            int len = fis.read();
            System.out.println(len);// 1
            len = fis.read();
            System.out.println(len);// 2
            len = fis.read();
            System.out.println(len);// 3
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    // 释放资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 发现以上读取文件是一个重复的过程,所以可以使用循环优化
     *             不知道文件中有多少字节,使用while循环
     *             while循环结束条件,读取到-1的时候结束
     *
     *             布尔表达式(len = fis.read())!=-1
     *                 1.fis.read():读取一个字节
     *                 2.len = fis.read():把读取到的字节赋值给变量len
     *                 3.(len = fis.read())!=-1:判断变量len是否不等于-1
     */
    public static void test1(){
        // 创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("b.txt");
            // 使用FileInputStream对象中的方法read,读取文件
            byte[] bytes = new byte[1024];
            int len = 0;//记录每次读取的有效字节的个数
            while((len = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    // 释放资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字节输入流一次读取多个字节的方法:
     *         int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
     *     明确两件事情:
     *         1.方法的参数byte[]的作用?
     *             起到缓冲作用,存储每次读取到的多个字节
     *             数组的长度一把定义为1024(1kb)或者1024的整数倍
     *         2.方法的返回值int是什么?
     *             每次读取的有效字节个数
     *
     *     String类的构造方法
     *         String(byte[] bytes) :把字节数组转换为字符串
     *         String(byte[] bytes, int offset, int length)
     *                  把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
     */

    public static void test2(){
        // 创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("b.txt");
            // 使用FileInputStream对象中的方法read,读取文件
            //int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
            byte[] bytes = new byte[2];
            int len = fis.read(bytes);
            System.out.println(len);
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    // 释放资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 文件复制练习:一读一写
     *
     *     明确:
     *         数据源: E:\1_Code\Java\IDEA\DailyPractice\IO\1.jpg
     *         数据的目的地: d:\\1.jpg
     *
     *     文件复制的步骤:
     *         1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
     *         2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
     *         3.使用字节输入流对象中的方法read读取文件
     *         4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
     *         5.释放资源
     */
    public static void copy(){
        long currentTimeMillis = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.jpg");
            fos = new FileOutputStream("d:\\1.jpg");

            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    // 释放资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("用时：" + (currentTimeMillis1 - currentTimeMillis) + " 毫秒");
    }
    /**
     * 使用字节流读取中文文件
     *     1个中文
     *         GBK:占用两个字节
     *         UTF-8:占用3个字节
     */
    public static void test3(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c.txt");
            int len = 0;
            while((len = fis.read())!=-1){
                System.out.println((char)len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
