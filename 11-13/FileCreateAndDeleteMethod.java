package file.test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author ellen
 * @date 2019-11-13 10:58
 * @description：File类创建删除功能的方法
 *         - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 *         - public boolean delete() ：删除由此File表示的文件或目录。
 *         - public boolean mkdir() ：创建由此File表示的目录。
 *         - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class FileCreateAndDeleteMethod {
    /*
    public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
        true:文件不存在,创建文件,返回true
        false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常
                public boolean createNewFile() throws IOException
                createNewFile声明抛出了IOException,调用这个方法,就必须处理这异常,要么throws,要么try-catch
     */
    @Test
    public void createNewFileTest() throws IOException {
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\creaetNewFile.txt");
        System.out.println(file.createNewFile());
        /*
        File file1 = new File("IO\\src\\filesrc\\新建文件夹");
        System.out.println(file1.createNewFile());// java.io.IOException: 系统找不到指定的路径。
        */

        File file2 = new File("新建文件夹");// 创建在 Project 下
        // file2 虽然没有后缀名，但不是文件夹，所以创建成功
        System.out.println(file2.createNewFile());
    }
    /*
    public boolean mkdir() ：创建单级空文件夹
    public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
            创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
            返回值:布尔值
                true:   文件夹不存在,创建文件夹,返回true
                false:  文件夹存在,不会创建,返回false;
                注意：构造方法中给出的路径不存在，返回false
                      这两个方法只能创建文件夹,不能创建文件
     */
    @Test
    public void mkdirTest(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\folder1");
        System.out.println(file.mkdir());// true
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\folder2");
        System.out.println(file1.mkdirs());// true

        File file2 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\a\\b\\c\\d");
        System.out.println(file2.mkdir());// false
        System.out.println(file2.mkdirs());// true
    }
    @Test
    public void mkdirsTest(){
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\folder2");
        System.out.println(file1.mkdirs());
        File file2 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc\\a\\b\\c\\d");
        System.out.println(file2.mkdir());
        System.out.println(file2.mkdirs());

        File file3 = new File("DailyPractice\\IO\\src\\filesrc\\relativelyPathFile.txt");
        System.out.println(file3.mkdir());// false ???
    }
    /*
    public boolean delete() ：删除由此File表示的文件或目录。（递归删除）
        此方法可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
          true:文件/文件夹删除成功,返回true
          false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false

        注意：delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
    @Test
    public void deleteTest(){
        File file1 = new File("新建文件夹");
        System.out.println(file1.delete());

        File file2 = new File("文件夹.txt");
        boolean delete1 = file2.delete();
        System.out.println(delete1);// false

        File file3 = new File("111\\222\\333\\444");
        if(!file3.exists()){
            System.out.println(file3.mkdirs());// 第一次运行：true
                                                // 第二次运行：false
            System.out.println("成功创建");
        }else{
            boolean delete2 = file3.delete();
            System.out.println(delete2);// 第一次运行：false
                                        // 第二次运行：true
            System.out.println("成功删除");
        }

        // 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\filesrc");// 非空文件及
        System.out.println(file.delete());// false
    }
}
