package file.test;

import java.io.File;

/**
 * @author ellen
 * @date 2019-11-13 9:04
 * @description：File类静态变量、构造方法
 */
public class FileConstructor {
    public static void main(String[] args) {
//        testConstructor();
//        testConstructor1();
        testConstructor2();
//        testSeparator();
    }

    /**
     * static String pathSeparator : 与系统有关的路径分隔符
     *                                  windows ;（分号）   linux  :（冒号）
     * static char pathSeparatorChar : 与系统有关的路径分隔符
     *
     * static String separator : 与系统有关的默认（文件）名称分隔符
     *                                  windows \（反斜杠）  Linux /（正斜杠）
     * static char separatorChar : 与系统有关的默认名称分隔符
     * public static final String separator = "" + separatorChar;
     *
     * 操作路径:路径不能写死，用的系统会不一样
     *              C:\develop\a\a.txt  windows
     *              C:/develop/a/a.txt  linux
     *             "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"  √
     */
    private static void testSeparator() {
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");
                                // E:\1_Code\Java\IDEA\DailyPractice
        File file1 = new File("E:" + File.separator + "1_Code" + File.separator + "Java" + File.separator
                + "IDEA" + File.separator + "DailyPractice");
                                // E:\1_Code\Java\IDEA\DailyPractice

        System.out.println(file);
        System.out.println(file1);
    }

    /*
       File(File parent, String child) 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
            参数:把路径分成了两部分
                File parent:父路径
                String child:子路径
            好处:
                 父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
                 父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
      */
    private static void testConstructor2() {
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice");
        // public File(File parent, String child)
        File file1 = new File(file, "IO\\src\\file");

        System.out.println(file);
        System.out.println(file1);

        test(file, "IO\\src\\file");
    }
    public static void test(File file1, String file2) {
        File file = new File(file1, file2);
        System.out.println(file);
    }

        /**
         File(String parent, String child)
                 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
                 参数:把路径分成了两部分
                     String parent:父路径
                     String child:子路径
                 好处:
                     父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
         */
    private static void testConstructor1() {
        //public File(String parent, String child)
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice", "IO\\src\\file");
        System.out.println(file);
    }

    /**
     File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
             参数:
                 String pathname:字符串的路径名称
                      路径可以是以文件结尾,也可以是以文件夹结尾
                      路径可以是相对路径,也可以是绝对路径
                      路径可以是存在,也可以是不存在
                      创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
    */
    private static void testConstructor() {
        // public File(String pathname)
        File file = new File("IO\\src\\file");// 相对路径
                                                        // main()测试，相对路径即为当前的Project下
        // 绝对路径
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\file");

        // File 类重写了 toString()
        System.out.println(file);
        System.out.println(file1);
    }
}
