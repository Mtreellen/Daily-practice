/**
 * @author ellen
 * @date 2019-11-22 21:44
 * @description：转换成小写字母——LeetCode.709
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
 * 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase1("Hello"));
        System.out.println(toLowerCase1("here"));
        System.out.println(toLowerCase1("LOVELY"));
    }
    public static String toLowerCase1(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] >= 65 && (int) array[i] <= 90) {
                array[i] = (char) ((int) array[i] + 32);
            }
        }
        return new String(array);
    }
}
