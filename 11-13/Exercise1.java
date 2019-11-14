package file.exer;

import java.io.File;
import java.io.IOException;

/**
 * @author ellen
 * @date 2019-11-13 11:40
 * @description：File类练习
 *         利用File构造器，new一个文件目录file
 *         1)在其中创建多个文件和目录
 *         2)编写方法，实现删除file中指定文件的操作
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        test1();
//        delete(new File("1.txt"));// true
//        delete(new File("ddd"));// true
        // TODO:文件夹那块儿有些问题
//        delete(new File("aaa"));
    }

    public static void test1() throws IOException {
        File file = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\code\\z_exer");
        if(!file.exists()){
            System.out.println("文件创建：" + file.mkdir());
        }else{
            System.out.println("文件已经存在");
        }
        File folder = new File("IO\\code\\z_exer\\aaa\\bbb\\ccc");
        File folder1 = new File("IO\\code\\z_exer\\ddd");
        File txtFile = new File("IO\\code\\z_exer\\1.txt");
        File txtFile1 = new File("IO\\code\\z_exer\\aaa\\2.txt");
        File txtFile2 = new File("IO\\code\\z_exer\\aaa\\bbb\\3.txt");

        if(!folder.exists()){
            System.out.println("文件创建：" + folder.mkdirs());
        }else{
            System.out.println("文件已经存在");
        }
        if(!folder1.exists()){
            System.out.println("文件创建：" + folder1.mkdirs());
        }else{
            System.out.println("文件已经存在");
        }
        if(!txtFile.exists()){
            System.out.println("文件创建：" + txtFile.createNewFile());
        }else{
            System.out.println("文件已经存在");
        }
        if(!txtFile1.exists()){
            System.out.println("文件创建：" + txtFile1.mkdirs());
        }else{
            System.out.println("文件已经存在");
        }
        if(!txtFile2.exists()){
            System.out.println("文件创建：" + txtFile2.mkdirs());
        }else{
            System.out.println("文件已经存在");
        }
    }
    public static void delete(File file){
        String fileName = file.getName();
        File file1 = new File("E:\\1_Code\\Java\\IDEA\\DailyPractice\\IO\\src\\exersrc", fileName);
        if(file1.exists()){
            if(file1.isDirectory()){
                deleteFolder(file1);
            }else{
                System.out.println(file1.delete());
            }
        }else{
            System.out.println("文件不存在");
        }
    }

    private static void deleteFolder(File file) {
        boolean delete = file.delete();
        if(delete){
            System.out.println(file.getName() + " 删除成功！！");
        }else{
            File[] list = file.listFiles();
            for (File item : list){
                deleteFolder(item);
            }
        }


    }
}
