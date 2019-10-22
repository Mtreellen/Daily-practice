package basic;

import java.util.Scanner;

/**
 * @author mtreellen
 * @date 2019-10-22-18:55
 */
public class LoopTest {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
//        test9();
//        test10();
        test11();
    }
    public static void test(){
        System.out.print("13的倍数：");
        for (int i = 1; i <= 100; i++) {
            if(i % 13 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
    public static void test1(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    public static void test2(){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
//                System.out.println(i + " ");
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void test3(){
        int i = 10;
        while(i > 0){
            i = i + 1;
            if(i == 10){
                break;
            }
        }
        System.out.println(i);//-2147483648
    }
    public static void test4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入长方形的长> ");
        int length = scanner.nextInt();
        System.out.print("请输入长方形的宽> ");
        int width = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }
    public static void test5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入直角三角形的高> ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }
    public static void test6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入直角三角形的高> ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i ; j--) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }
    public static void test7(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void test8(){
        System.out.println();
        int day = 0;
        for (int j = 3000; j >= 5; j /= 2) {
            day++;
        }
        System.out.println(day);
    }
    public static void test9(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 3 != 0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(count);
    }

    public static void test10() {
        int key = (int) (Math.random() * 99 + 1);
        int count = 0;
        while(true) {
            System.out.print("请输入您猜的数字[0~100]：");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            count++;
            if(guess > key){
                System.out.println("大了");
            }else if( guess < key){
                System.out.println("小了");
            }else{
                break;
            }
        }
        System.out.println("恭喜您，猜对了！！！！\n您一共猜了" + count + "次。");
    }
    public static void test11(){
        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
class Looptest1{
    public static void main(String[] args) {
//        test();
//        test1();
//        System.out.println(greatestCommonDivisor(4, 13));
//        System.out.println(lowestCommonMultiple(4, 13));
//        test2();test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test10();
    }

    public static void test(){
        for (int i = 1; i <= 1000 ; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            if(i == sum){
                System.out.print(i + " ");
            }
        }
    }
    public static void test1(){
        System.out.println("\n1-1000之间的完数有：");
        for(int i=1;i<=1000;i++){
            int sum = 0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum +=j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

//    public static int greatestCommonDivisor(int x, int y) {
//        int min = (int)Math.min(x, y);
//        boolean flag = false;
//        int res = 0;
//        for (int i = 1; i < min; i++) {
//            if(i % x == 0 && i % y == 0){
//                flag = true;
//                res = i;
//            }
//        }
//        if(flag){
//
//        }
//    }
    public static int greatestCommonDivisor(int x, int y){
        int min = (int)Math.min(x, y);
        boolean flag = false;
        int res = 0;
        for (int i = min; i >= 1; i--) {
            if(x % i == 0 && y % i == 0){
                flag = true;
                res = i;
                break;
            }
        }
        if(flag){
            return res;
        }else{
            return 1;
        }
    }
    public static int lowestCommonMultiple(int x, int y){
        int max = (int)Math.max(x, y);
        int res = 0;
        for (int i = max;; i++) {
            if (i % x == 0 && i % y == 0) {
                res = i;
                break;
            }
        }
        return res;
    }
    public static void test2(){
        double sum = 0.0;
        int i = 1;
        while (true) {
            sum += 1.0 / i;
            if(sum > 10){
                break;
            }
            i++;
        }
        System.out.println(i);
    }

    public static void test3() {
        double sum = 0.0;
        int i = 1;
        while (true) {
            sum += 1.0 / i;
            if (sum > 10) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }

    public static void test4(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void test5(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void test6(){
        //TODO:
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                if(i < 5) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
//            if(i < 5) {
//                System.out.println();
//            }
        }
        int tmp = 6;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= tmp; j++) {
                System.out.print(" ");
            }
            tmp -= 2;
            for (int j = 0; j < i + 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void test7(){
        for (int i = 100; i <= 200; i++) {
            int j = 1;
            for (j = 2; j < i; j++) {
                if(i % j == 0){
                    break;
                }
            }
            if(j >= i){
                System.out.print(i + " ");
            }
        }
    }
    public static void test8(){
        //TODO:输出质数优化
    }
    public static void test9(){
        //TODO:吸血鬼数字
    }

    public static void test10() {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 100; i < 1000; i++) {// 实现所有的三位数的一个遍历
            int j1 = 0;
            int j2 = 0;
            int j3 = 0;
            j1 = i / 100;// 百位
            j2 = (i - 100 * j1) / 10;// 十位
            j3 = i - 100 * j1 - 10 * j2;// 个位

            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
                System.out.println("此数值为满足条件的水仙花数:" + i);
            }
        }
    }
}
class LoopTest2{
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
        test4();
    }
    public static void test(){
        int water = 15;
        int count = 0;
        while(water < 50){
            water += 5;
            count++;
        }
        System.out.println(count);
    }
    public static void test1(){
        String mark = "690123456789";
        char[] chars = mark.toCharArray();
        int evenNumSum = 0;
        int oddNumSum = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] % 2 == 0){
                evenNumSum += (chars[i] - 48);
            }else{
                oddNumSum += (chars[i] - 48);
            }
        }
        int num1 = oddNumSum + evenNumSum * 3;
        System.out.println(num1);
        int num2 = num1 % 10;
        int key = 0;
        if(num2 != 0){
            key = 10 - num2;
        }
        System.out.println(evenNumSum);
        System.out.println(oddNumSum);
        System.out.println(num2);
        System.out.println(mark + key);
    }
    public static void test2(){
        int evenNum = 0;
        int oddNum = 0;
//        char[] chars = new char[4];
        int[] arr = new int[4];
        for (int i = 1000; i < 10000; i++) {
            evenNum = 0;
            oddNum = 0;
            int a = i / 1000;
            int b = i % 1000 / 100;
            int c = i % 100 / 10;
            int d = i % 10;
            System.out.println(a + " " + b + " " + c + " " + d);
            for (int j = 0; j < arr.length; j++) {
                arr[0] = a;
                arr[1] = b;
                arr[2] = c;
                arr[3] = d;
                if(arr[j] % 2 == 0){
                    evenNum++;
                }else{
                    oddNum++;
                }
            }
            System.out.println(i + "的偶数有" + evenNum + "个，奇数有" + oddNum + "个。");
        }
    }
    public static void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的身高(cm)> ");
        double height = scanner.nextDouble();
        System.out.print("请输入您的体重(斤)> ");
        double weight = scanner.nextDouble();

        double weight1 = weight + 10;
        double weight2 = weight - 10;

        if(( (height - 108) * 2 >= weight2 ) && (( height - 108) * 2 <= weight1) ){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
    public static void test4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一条边：");
        double length1 = scanner.nextDouble();
        System.out.print("请输入第二条边：");
        double length2 = scanner.nextDouble();
        System.out.print("请输入第三条边：");
        double length3 = scanner.nextDouble();

        if(isTriangle(length1, length2, length3)){
            if(length1 == length2 && length2 == length3){
                System.out.println("等边三角形，面积为：" + findArea(length1, length2, length3));
            }else if(length1 == length2 || length1 == length3 || length2 == length3){
                if(isRightTriangle(length1, length2, length3)){
                    System.out.println("等腰直角三角形，面积为：" + findArea(length1, length2, length3));
                }
                System.out.println("等腰三角形，面积为：" + findArea(length1, length2, length3));
            }else if(isRightTriangle(length1, length2, length3)){
                System.out.println("直角三角形，面积为：" + findArea(length1, length2, length3));
            }else{
                System.out.println("普通三角形，面积为：" + findArea(length1, length2, length3));
            }
        }else{
            System.out.println("不构成三角形");
        }


    }
    public static boolean isTriangle(double x, double y, double z){
        if(x + y > z && x + z > y && y + z > x){
            return true;
        }else{
            return false;
        }
    }
    public static double findArea(double x, double y, double z){
        if(!(isTriangle(x, y, z))){
            throw new RuntimeException("不构成三角形");
        }
        double perimeter = x + y + z;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        return area;
    }
    public static boolean isRightTriangle(double x, double y, double z){
        if(!(isTriangle(x, y, z))){
            throw new RuntimeException("不构成三角形");
        }
        double a = Math.sqrt(x * x + y * y);
        double b = Math.sqrt(x * x + z * z);
        double c = Math.sqrt(z * z + y * y);
        if(x == c || y == b || z == a){
            return true;
        }else{
            return false;
        }
    }
}
