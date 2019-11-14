package file.test;

import java.io.File;
import java.io.IOException;

/**
 * @author ellen
 * @date 2019-11-13 10:51
 * @description：File类重命名功能的方法
 *
 * public boolean renameTo(File dest):把文件重命名为指定的文件路径
 */
public class FileRenameMethod {
    public static void main(String[] args) throws IOException {
        renameToTest();
    }

    private static void renameToTest() throws IOException {
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\renameTo方法.txt");
        File file1 = new File("IO\\src\\filesrc\\renameTo方法新名字.txt");
        if(file.exists()) {
            boolean renameTo = file.renameTo(file1);
            System.out.println(renameTo);
        }else{
            file.createNewFile();
            boolean renameTo = file.renameTo(file1);
            System.out.println(renameTo);
        }
    }
}
