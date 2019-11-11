package filter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author ellen
 * @date 2019-11-11 14:37
 * @description：创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    /**
     * 过滤的规则:
     *             在accept方法中,判断File对象是否是以.java结尾
     *             是就返回true
     *             不是就返回false
     * @param pathname：如果pathname是一个文件夹,返回true,然后继续遍历这个文件夹
     * @return
     */
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
//class FilenameFilterImpl implements FileFilter{
//    @Override
//    public boolean accept(File pathname) {
//        return false;
//    }
//}