package string.stringalgorithm;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-11-09 21:35
 * @description 关于 Scanner 类的一些注意点
 */
public class ScannerTest {
    public static void main(String[] args) {
//        test();
//        test1();
        test2();
    }
    // 注意 next() 和 nextLine() 的区别
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();// 键盘输入：qwerwr wqerqwr
        System.out.println(next);// qwerwr

        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();// 键盘输入：qwe qwe qwe
        System.out.println(input);// qwe qwe qwe
    }

    /**
     * nextInt() 与 next() 搭配使用 ok
     */
    public static void test1(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String next = scanner.next();
        System.out.println(i);
        System.out.println(next);
    }
    /**
     * nextInt() 与 nextLine() 搭配使用 不能实现需求
     */
    public static void test2(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String next = scanner.nextLine();// 将 回车 读取
        System.out.println(i);
        System.out.println(next);
    }
}
