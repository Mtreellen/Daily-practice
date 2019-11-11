package buffer;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;
import java.util.HashMap;

/**
 * @author ellen
 * @date 2019-11-11 20:53
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        try {
//            copy();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            testSort();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copy() throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\2.jpg"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("用时：" + (currentTimeMillis1 - currentTimeMillis) + " 毫秒");
    }
    /**
     * 练习:
     *         对文本的内容进行排序
     *         按照(1,2,3....)顺序排序
     *     分析:
     *         1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
     *         2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
     *         3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
     *         4.使用字符缓冲输入流中的方法readline,逐行读取文本
     *         5.对读取到的文本进行切割,获取行中的序号和文本内容
     *         6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
     *         7.遍历HashMap集合,获取每一个键值对
     *         8.把每一个键值对,拼接为一个文本行
     *         9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
     *         10.释放资源
     */
    public static void testSort() throws IOException {
        HashMap<java.lang.String, java.lang.String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        java.lang.String line;
        while((line = br.readLine()) != null){
            java.lang.String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }
        for (java.lang.String key : map.keySet()){
            java.lang.String value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            br.readLine();
        }
        bw.close();
        br.close();
    }
}
