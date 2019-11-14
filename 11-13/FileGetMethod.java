package file.test;

import java.io.File;
import java.util.Date;

/**
 * @author ellen
 * @date 2019-11-13 9:35
 * @description：File类获取功能的方法
 *       - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 *       - public String getPath() ：将此File转换为路径名字符串。
 *       - public String getName()  ：返回由此File表示的文件或目录的名称。
 *       - public String getParent()：获取上层文件目录路径。若无，返回null
 *       - public long length()  ：返回由此File表示的文件的长度。
 *       - public long lastModified() ：获取最后一次的修改时间，毫秒值
 */
public class FileGetMethod {
    public static void main(String[] args) {
//        testGetAbsolutePath();
//        testGetPath();
//        testGetName();
//        testGetParent();
//        testLength();
        testLastModified();
    }

    private static void testLastModified() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹
        System.out.println(new Date(file.lastModified()));
        System.out.println(new Date(file1.lastModified()));
        System.out.println(new Date(file2.lastModified()));
        System.out.println(new Date(folder1.lastModified()));
        System.out.println(new Date(folder2.lastModified()));
        System.out.println(new Date(folder3.lastModified()));
        /*
        Thu Jan 01 08:00:00 CST 1970
        Wed Dec 06 21:51:45 CST 2017
        Thu Jan 01 08:00:00 CST 1970
        Tue Nov 12 17:10:44 CST 2019
        Thu Jan 01 08:00:00 CST 1970
        Mon Nov 11 12:36:33 CST 2019
         */
    }

    /*
    public long length()  ：返回由此File表示的文件的长度。
        获取的是构造方法指定的文件的大小,以*字节*为单位
        注意： 1）文件夹是没有大小概念的,不能获取文件夹的大小
               2）如果构造方法中给出的路径不存在,那么 length 方法返回 0
     */
    private static void testLength() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹


        long fileLength = file.length();// 0
        long fileLength1 = file1.length();// 86086字节
        // TODO：同样是文件夹，为什么结果不一致？
        long folderLength = folder1.length();// 4096   ？？？
        long folderLength1 = folder2.length();// 0      ? ? ?
        long folderLength2 = folder3.length();// 0

        System.out.println(fileLength);
        System.out.println(fileLength1);
        System.out.println(folderLength);
        System.out.println(folderLength1);
        System.out.println(folderLength2);
    }

    /*
    public String getParent()：获取上层文件目录路径。若无，返回null
     */
    private static void testGetParent() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹

        String parent = file.getParent();
        File parentFile = file.getParentFile();
        String parent1 = file1.getParent();
        File parentFile1 = file1.getParentFile();
        String parent2 = file2.getParent();
        File parentFile2 = file2.getParentFile();

        String parentFolder = folder1.getParent();
        File parentFileFolder = folder1.getParentFile();
        String parentFolder1 = folder2.getParent();
        File parentFileFolder1 = folder2.getParentFile();
        String parentFolder2 = folder3.getParent();
        File parentFileFolder2 = folder3.getParentFile();

        System.out.println("不存在的文件.txt : " + parent);// null
        System.out.println("不存在的文件.txt : " + parentFile);// null
        System.out.println("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG : " + parent1);// E:\1_Code\Java\IDEA\DailyPractice\IO
        System.out.println("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG : " + parentFile1);// E:\1_Code\Java\IDEA\DailyPractice\IO
        System.out.println("1.JPG : " + parent2);// null
        System.out.println("1.JPG : " + parentFile2);// null
        System.out.println("E:\\1_Code\\Java\\IDEA\\DailyPractice : " + parentFolder);// E:\1_Code\Java\IDEA
        System.out.println("E:\\1_Code\\Java\\IDEA\\DailyPractice : " + parentFileFolder);// E:\1_Code\Java\IDEA
        System.out.println("E:\\1_Code\\Java\\IDEA\\不存在的文件 : " + parentFolder1);// E:\1_Code\Java\IDEA
        System.out.println("E:\\1_Code\\Java\\IDEA\\不存在的文件 : " + parentFileFolder1);// E:\1_Code\Java\IDEA
        System.out.println("E:\\1_Code\\Java\\IDEA\\testFolder : " + parentFolder2);// E:\1_Code\Java\IDEA
        System.out.println("E:\\1_Code\\Java\\IDEA\\testFolder : " + parentFileFolder2);// E:\1_Code\Java\IDEA
    }

    /*
    public String getName()  ：返回由此File表示的（当前）文件或目录的名称。
        获取的就是构造方法传递路径的*结尾*部分(文件/文件夹)
     */
    private static void testGetName() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\不存在的文件.txt");
        File folder = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾

        String fileName = file.getName();
        String fileName1 = file1.getName();
        String folderName = folder.getName();

        System.out.println(fileName);// 不存在的文件.txt
        System.out.println(fileName1);// 不存在的文件.txt
        System.out.println(folderName);// DailyPractice
    }

    /*
    public String getPath() ：将此File转换为路径名字符串。
        1）获取的构造方法中传递的路径，相对就是相对，绝对就是绝对。
        2）toString方法调用的就是getPath方法，源码：
                public String toString() {
                    return getPath();
                }
     */
    private static void testGetPath() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\不存在的文件.txt");

        String path = file.getPath();
        String path1 = file1.getPath();

        System.out.println(path);// 不存在的文件.txt
        System.out.println(path1);// E:\1_Code\Java\IDEA\DailyPractice\IO\src\不存在的文件.txt

        System.out.println(file);// 不存在的文件.txt
        System.out.println(file.toString());// 不存在的文件.txt
    }

    // public String getAbsolutePath() ：返回此File的绝对路径名字符串。
    // 获取的构造方法中传递的路径
    // 无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
    private static void testGetAbsolutePath() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\不存在的文件.txt");

        String absolutePath = file.getAbsolutePath();
        String absolutePath1 = file1.getAbsolutePath();

        System.out.println(absolutePath);// E:\1_Code\Java\IDEA\DailyPractice\不存在的文件.txt
        System.out.println(absolutePath1);// E:\1_Code\Java\IDEA\DailyPractice\IO\src\不存在的文件.txt

        System.out.println(file);// 不存在的文件.txt
        System.out.println(file.toString());// 不存在的文件.txt
    }

}
