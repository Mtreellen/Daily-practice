package bufferstream.exer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ellen
 * @date 2019-11-14 10:20
 * @description——获取文本上每个字符出现的次数
 *  提示：遍历文本的每一个字符；字符及出现的次数保存在Map中；将Map中数据 写入文件
 * 思路：
 *      1.遍历文本每一个字符
 *      2.字符出现的次数存在Map中
 *
 *      Map<Character,Integer> map = new HashMap<Character,Integer>();
 *      map.put('a',18);
 *      map.put('你',2);
 *
 *       3.把map中的数据写入文件
 */
public class CountWords {
    /*
    说明：IDEA
            如果使用单元测试，文件相对路径为当前module
           如果使用main()测试，文件相对路径为当前工程
     */
    public static void main(String[] args) throws IOException {
//        countWords();
        countWords2();
    }
    public static void countWords1() throws IOException {
        long l = System.currentTimeMillis();
        // 乱码
//        FileReader fr = new FileReader(new File("IO\\src\\z_filesrc\\dbcp_gbk.txt"));
        FileReader fr = new FileReader(new File("IO\\src\\z_filesrc\\dbcp.txt"));
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(new File("IO\\src\\outCount.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        Map<Character, Integer> map = new HashMap<>();
        int ch = 0;
        while((ch = br.read()) != -1){
            char c = (char)ch;
            if(map.get(c) == null){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            switch(entry.getKey()){
                case ' ':
                    bw.write("空格 = " + entry.getValue());
                    break;
                case '\t'://\t表示tab 键字符
                    bw.write("tab键 = " + entry.getValue());
                    break;
                case '\r'://
                    bw.write("回车 = " + entry.getValue());
                    break;
                case '\n'://
                    bw.write("换行 = " + entry.getValue());
                    break;
                default:
                    bw.write(entry.getKey() + " = " + entry.getValue());
                    break;
            }
            bw.newLine();
        }
        bw.close();
        br.close();
        long l1 = System.currentTimeMillis();
        System.out.println("耗时：" + (l1 - l) + " 毫秒");
    }
    public static void countWords2() throws IOException {
        long l = System.currentTimeMillis();
        // TODO：乱码
        FileInputStream fis = new FileInputStream(new File("IO\\src\\z_filesrc\\dbcp_gbk.txt"));
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        FileWriter fw = new FileWriter(new File("IO\\src\\outCountWords2.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        Map<Character, Integer> map = new HashMap<>();
        int ch = 0;
        while((ch = br.read()) != -1){
            char c = (char)ch;
            if(map.get(c) == null){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            switch(entry.getKey()){
                case ' ':
                    bw.write("空格 = " + entry.getValue());
                    break;
                case '\t'://\t表示tab 键字符
                    bw.write("tab键 = " + entry.getValue());
                    break;
                case '\r'://
                    bw.write("回车 = " + entry.getValue());
                    break;
                case '\n'://
                    bw.write("换行 = " + entry.getValue());
                    break;
                default:
                    bw.write(entry.getKey() + " = " + entry.getValue());
                    break;
            }
            bw.newLine();
        }
        bw.close();
        br.close();
        long l1 = System.currentTimeMillis();
        System.out.println("耗时：" + (l1 - l) + " 毫秒");
    }
    public static void countWords() throws IOException {
        long l = System.currentTimeMillis();
        // TODO：用 字节流 实现
//        FileReader fr = new FileReader(new File("IO\\src\\z_filesrc\\dbcp_gbk.txt"));
        FileInputStream fis = new FileInputStream(new File("IO\\src\\z_filesrc\\dbcp.txt"));
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(new File("IO\\src\\outCountByte.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        Map<Character, Integer> map = new HashMap<>();
        int ch = 0;
        while((ch = bis.read()) != -1){
            char c = (char)ch;
            if(map.get(c) == null){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            switch(entry.getKey()){
                case ' ':
                    bos.write(("空格 = " + entry.getValue()).getBytes());
                    break;
                case '\t'://\t表示tab 键字符
                    bos.write(("tab键 = " + entry.getValue()).getBytes());
                    break;
                case '\r'://
                    bos.write(("回车 = " + entry.getValue()).getBytes());
                    break;
                case '\n'://
                    bos.write(("换行 = " + entry.getValue()).getBytes());
                    break;
                default:
                    bos.write((entry.getKey() + " = " + entry.getValue()).getBytes());
                    break;
            }
            bos.write("\n".getBytes());
        }
        bos.close();
        bis.close();
        long l1 = System.currentTimeMillis();
        System.out.println("耗时：" + (l1 - l) + " 毫秒");
    }
}
