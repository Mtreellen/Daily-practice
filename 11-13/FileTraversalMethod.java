package file.test;

import java.io.File;

/**
 * @author ellen
 * @date 2019-11-13 11:26
 * @description：File类遍历(文件夹)目录功能
 *      - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
 *      - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
 *
 *      注意：
 *      1、list方法和listFiles方法遍历的是构造方法中给出的目录
 *      2、如果构造方法中给出的目录的路径不存在,会抛出空指针异常
 *      3、如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
public class FileTraversalMethod {
    public static void main(String[] args) {
        listTest();
//        listFilesTest();
    }
    /*
    public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
            遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,
            把获取到的多个名称存储到一个String类型的数组中
            注意：可以遍历隐藏文件或文件夹
     */
    public static void listTest(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO");
        String[] list = file.list();
        for(String item : list){
            System.out.println(item);
        }

//        File file1 = new File("a.txt");// 非目录
//        String[] list1 = file1.list();
//        for(String item : list1){
//            System.out.print(item + " ");// NullPointerException
//        }
    }
    /*
    public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
                遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,
                把文件/文件夹封装为File对象,多个File对象存储到File数组中
     */
    public static void listFilesTest(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO");
        File[] list = file.listFiles();
        for(File item : list){
            System.out.println(item);
        }
    }
}
