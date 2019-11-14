package file.exer;

import com.sun.org.apache.bcel.internal.classfile.Code;
import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author ellen
 * @date 2019-11-13 12:16
 * @description：判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 */
public class Exercise2 {
    @Test
    public void test(){
        File file = new File("IO\\src\\exersrc\\ddd\\1.JPG");
        if(file.getName().toLowerCase().endsWith(".jpg")){
            System.out.println(file);
        }else{
            System.out.println("不是.jpg文件");
        }
    }
    @Test
    public void test1(){
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\exersrc");
        String[] list = file.list();
        if(list != null) {
            for (String item : list) {
                if (item.toLowerCase().endsWith(".jpg")) {
                    System.out.println(item);
                } else {
                    System.out.println(item + "  不是.jpg文件");
                }
            }
        }else{
            System.out.println("输入路径有误！！");
        }
    }
    @Test
    public void test2(){
        String pathname = "E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\code\\z_exer";
        File file = new File(pathname);
        findJPG(file);
        findJPG1(file);
        System.out.println("========递归遍历文件夹找到所有.jpg文件=======");
        findJPGRecursion(file);

        System.out.println("========借助过滤器找到指定文件下的.jpg文件=======");
        findJPGFilter(file);

        System.out.println("========借助过滤器找到指定文件下所有的.jpg文件=======");
        findJPGFilterAll(file);
    }
    public static void findJPG(File file){
        String[] list = file.list();
        if(list != null) {
            for (String item : list) {
                if (item.toLowerCase().endsWith(".jpg")) {
                    System.out.println(item);
                }
            }
        }
    }
    public static void findJPG1(File file){
        File[] list = file.listFiles();
        if(list != null) {
            for (File item : list) {
                if (item.getName().toLowerCase().endsWith(".jpg")) {
                    System.out.println(item.getAbsolutePath());
                }
            }
        }else{
            System.out.println("输入路径有误！！");
        }
    }
    public static void findJPGRecursion(File file){
        File[] list = file.listFiles();
        if(list != null) {
            for (File item : list) {
                if(item.isDirectory()){
                    findJPGRecursion(item);
                }else{
                    if (item.getName().toLowerCase().endsWith(".jpg")) {
                        System.out.println(item.getAbsolutePath());
                    }
                }
            }
        }else{
            System.out.println("输入路径有误！！");
        }
    }
    /*
    文件过滤器方法
        public String[] list(FilenameFilter file.filter)
        public File[] listFiles(FileFilter file.filter)
     */
    public static void findJPGFilter(File file){
        File[] list = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jpg");
            }
        });
        if(list != null) {
            for (File item : list) {
                System.out.println(item.getAbsolutePath());
            }
        }else{
            System.out.println("输入路径有误！！");
        }
    }
    public static void findJPGFilterAll(File file){
        /*
        accept() 返回 true 就存放到 list 中，否则不存放，达到过滤的目的
         */
        File[] list = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(dir.isDirectory()){
                    return true;
                }
                return name.toLowerCase().endsWith(".jpg");
            }
        });
        if(list != null) {
            for (File item : list) {
                System.out.println(item.getAbsolutePath());
            }
        }else{
            System.out.println("输入路径有误！！");
        }
    }
}
