package otherstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TODO：输出问题
 * @author ellen
 * @date 2019-11-14 11:18
 * @description
 * System.in
 * System.out
 *      练习：
 *      从键盘输入字符串，要求将读取到的整行字符串转成大写输出。
 *      然后继续 进行输入操作，直至当输入“e”或者“exit”时，退出程序。
 *          方式1：Scanner实现
 *          方式2：System.in实现
 */
public class SystemTest {
    public static void main(String[] args) {
        testSystemIn();
    }

    private static void testSystemIn() {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while (true) {
                System.out.print("请输入字符串：");
                String s = br.readLine();
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("====== 退出程序，拜拜 ======");
                    break;
                }
                String upperCase = s.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
