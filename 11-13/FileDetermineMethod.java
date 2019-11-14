package file.test;

import java.io.File;

/**
 * @author ellen
 * @date 2019-11-13 10:10
 * @description：File类判断功能的方法
 *         - public boolean exists() ：此File表示的文件或目录是否实际存在。
 *         - public boolean isDirectory() ：此File表示的是否为目录。
 *         - public boolean isFile() ：此File表示的是否为文件。
 *         - public boolean canRead() ：判断是否可读
 *         - public boolean canWrite() ：判断是否可写
 *         - public boolean isHidden() ：判断是否隐藏
 *
 *          注意：isDirectory() 与 isFile()
 *             1）电脑的硬盘中只有文件/文件夹,两个方法是互斥
 *             2）这两个方法使用前提,路径必须是存在的,否则都返回false
 */
public class FileDetermineMethod {
    public static void main(String[] args) {
//        isDirectoryTest();
//        isFileTest();
//        existsTest();
//        canReadTest();
//        canWriterTest();
        isHiddenTest();
    }

    private static void isHiddenTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹
        File folder4 = new File("E:\\1_Code\\Java\\IDEA\\隐藏文件夹");// 隐藏文件夹

        System.out.println(file.isHidden());// false
        System.out.println(file1.isHidden());// false
        System.out.println(file2.isHidden());// false
        System.out.println(folder1.isHidden());// false
        System.out.println(folder2.isHidden());// false
        System.out.println(folder3.isHidden());// false
        System.out.println(folder4.isHidden());// true
    }

    private static void canWriterTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹
        File folder4 = new File("E:\\1_Code\\Java\\IDEA\\隐藏文件夹");// 隐藏文件夹

        System.out.println(file.canWrite());// false
        System.out.println(file1.canWrite());// true
        System.out.println(file2.canWrite());// false
        System.out.println(folder1.canWrite());// true
        System.out.println(folder2.canWrite());// false
        System.out.println(folder3.canWrite());// true
        System.out.println(folder4.canWrite());// true
    }

    private static void canReadTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹
        File folder4 = new File("E:\\1_Code\\Java\\IDEA\\隐藏文件夹");// 隐藏文件夹

        System.out.println(file.canRead());// false
        System.out.println(file1.canRead());// true
        System.out.println(file2.canRead());// false
        System.out.println(folder1.canRead());// true
        System.out.println(folder2.canRead());// false
        System.out.println(folder3.canRead());// true
        System.out.println(folder4.canRead());// true
    }

    private static void existsTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");// 相对路径，IDEA为当前项目下， 1.jpg在 module下， 所以不存在与当前项目目录下
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹

        System.out.println(file.exists());// false
        System.out.println(file1.exists());// true
        System.out.println(file2.exists());// false
        System.out.println(folder1.exists());// true
        System.out.println(folder2.exists());// false
        System.out.println(folder3.exists());// true

        System.out.println("==============================");
        // 不存在的文件没必要判断，所以，先判断是否存在
        if(file.exists()){
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        }
        System.out.println("==============================");
    }

    private static void isFileTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");// 相对路径，IDEA为当前项目下， 1.jpg在 module下， 所以不存在与当前项目目录下
        File file3 = new File("2.jpg");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹

        System.out.println(file.isFile());// false
        System.out.println(file1.isFile());// true
        System.out.println(file2.isFile());// false
        System.out.println(file3.isFile());// true
        System.out.println(folder1.isFile());// false
        System.out.println(folder2.isFile());// false
        System.out.println(folder3.isFile());// false
    }

    private static void isDirectoryTest() {
        File file = new File("不存在的文件.txt");
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\1.JPG");
        File file2 = new File("1.JPG");
        File folder1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");// 文件夹结尾
        File folder2 = new File("E:\\1_Code\\Java\\IDEA\\不存在的文件");// 文件夹
        File folder3 = new File("E:\\1_Code\\Java\\IDEA\\testFolder");// 文件夹

        System.out.println(file.isDirectory());// false
        System.out.println(file1.isDirectory());// false
        System.out.println(file2.isDirectory());// false
        System.out.println(folder1.isDirectory());// true
        System.out.println(folder2.isDirectory());// false
        System.out.println(folder3.isDirectory());// true
    }
}
