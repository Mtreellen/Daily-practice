package string.stringalgorithm;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author mtreellen
 * @date 2019-11-09 21:11
 * @description 涉及到字符串的算法问题
 */
public class StringAlgorithm {


}

/**
 * 给定个字符串，判断这个字符串是否都是数字组成
 */
class IsNumeric{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            // 输入 q 则循环结束，进而程序结束
            if(str.equals("q")){
                break;
            }
            boolean flag = isNumeric1(str);
            System.out.println(flag);
        }
    }

    /**
     * 借助 Character 类中的 isDigit()
     * @param str ：传入字符串
     * @return ：字符串每个字符全都是数字，返回 true
     *              不全是 数字，返回 false
     */
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 借助 String 类中的 toCharArray() 将字符串变为 字符数组
     * 然后 借助 ASCII 码
     * @param str
     * @return ：字符串每个字符全都是数字，返回 true
     *          不全是 数字，返回 false
     */
    public static boolean isNumeric1(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!(chars[i] > '0' && chars[i] < '9')){
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric2(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static boolean isNumeric3(String str) {
        for (int i = str.length(); --i >= 0; ) {
            int chr = str.charAt(i);
            if (chr < 48 || chr > 57)
                return false;
        }
        return true;
    }
}