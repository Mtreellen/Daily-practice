package characterstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ellen
 * @date 2019-11-11 19:42
 * @description：字符输出流写数据的其他方法
 *         - void write(char[] cbuf)写入字符数组。
 *         - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *         - void write(String str)写入字符串。
 *         - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class FileWriterMethod {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("f.txt");

        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        fw.write(chars);
        fw.write(chars, 2, 2);

        String s = "\nhello";
        fw.write(s);
        fw.write(s, 4, 1);// l  —— 表明 \n 占一个字符
        fw.close();
    }
}
