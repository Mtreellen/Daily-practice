package filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author ellen
 * @date 2019-11-11 14:32
 * @description：使用过滤器来实现文件递归遍历
 *     在File类中有两个和ListFiles重载的方法, 方法的参数传递的就是过滤器
 *     1.File[] listFiles(FileFilter filter)
 *          java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器。
 *              作用:用来过滤文件(File对象)
 *              抽象方法:用来过滤文件的方法
 *                  boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
 *                      参数:
 *                          File pathname:使用ListFiles方法遍历目录,得到的每一个文件对象
 *     2.File[] listFiles(FilenameFilter filter)
 *          java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
 *              作用:用于过滤文件名称
 *              抽象方法:用来过滤文件的方法
 *                  boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
 *                  参数:
 *                      File dir:构造方法中传递的被遍历的目录
 *                      String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
 *     注意:
 *         两个过滤器接口是没有实现类的,需要自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class FileFilterTest {
    public static void main(String[] args) {
        printDirectoryRecursion();
    }
    public static void getAllFiles(File dir){
        /**
         * listFiles()
         * （1)listFiles()会对构造方法中传递的目录进行遍历，获取目录中的每一个文件/文件夹-》封装为File对象
         * （2）listFiles()会调用参数传递给过滤器中的方法accept()
         * （3）listFiles()会把遍历得到的每一个File对象，传递给accept()的参数 pathname
         */
        File[] list = dir.listFiles(new FileFilterImpl());
        for(File item : list){
            if(item.isDirectory()){
                getAllFiles(item);
            }else{
                System.out.println(item);
            }
        }
    }
    public static void printDirectoryRecursion(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\a");
        getAllFiles(file);
    }
}
class FilenameFilterTest{
    public static void main(String[] args) {
        printDirectoryRecursion();
    }
    public static void getAllFiles(File dir){
//        File[] list = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
//            }
//        });
        /**
         * 使用 Lambda 表达式优化匿名内部类(接口中只有一个抽象方法)
         * () -> {}
         */
        File[] list = dir.listFiles((File d, String n)->{
            return new File(d, n).isDirectory() || n.toLowerCase().endsWith(".java");
        });


        //使用Lambda表达式优化匿名内部类(接口中只有一个抽象方法)
        /*File[] files = dir.listFiles((File pathname)->{
            return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
        });*/

        File[] files = dir.listFiles(pathname->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));

        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/

        //使用Lambda表达式优化匿名内部类(接口中只有一个抽象方法)
        /*File[] files = dir.listFiles((File d, String name)->{
            //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
            return new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        //File[] files = dir.listFiles((d,name)->new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java"));
        for(File item : list){
            if(item.isDirectory()){
                getAllFiles(item);
            }else{
                System.out.println(item);
            }
        }
    }
    public static void printDirectoryRecursion(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\a");
        getAllFiles(file);
    }
}