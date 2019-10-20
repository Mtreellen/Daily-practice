package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-16:02
 */
public class ParameterTransferTest {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }
    public static void test(){
        int i = 4, j = 2;
        leftshift(i, j);
        System.out.println(i);
    }
    public static void leftshift(int i, int j){
        i+=j;
    }

    public static void test1(){
        int[] a=new int[1];
        modify(a);
        System.out.println(a[0]);
    }
    public static void modify(int[] a){
        a[0]++;
    }

    public static void test2(){
        TestA ta = new TestA();
        System.out.println(ta.i); //0
        ta.change(ta.i);//1
        System.out.println(ta.i); //0
        ta.change1(ta);  //1
        System.out.println(ta.i);//1
    }
    public static void test3(){
        int i = 0;
        change(i);
        i = i++;
        System.out.println("i = " + i);
    }
    public static void change(int i){
        i++;
    }

    public static void test4(){
        String str = new String("world");
        char[] ch = new char[]{'h','e','l','l','o'};
        change(str,ch);
        System.out.println(str);//world
        System.out.println(String.valueOf(ch));//abcde
    }
    public static void change(String str, char[] arr){
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }

    public static void test5() {
        TestB t = new TestB();
        t.f();
    }
}
class TestB {
    int a;
    int b;

    public void f() {
        a = 0;
        b = 0;
        int[] c = {0};
        g(b, c);
        System.out.println(a + " " + b + " " + c[0]);
    }

    public void g(int b, int[] c) {
        a = 1;
        b = 1;
        c[0] = 1;
    }
}
class TestA {
    int i ;
    void change(int i){
        i++;
        System.out.println(i);
    }
    void change1(TestA t){
        t.i++;
        System.out.println(t.i);
    }
}
class Value{
    int i = 15;
}
class Test{
    public static void main(String argv[]) {
        Test t = new Test();
        t.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(" " + v.i);
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.print(v.i + " " + i);
    }
}
class Test2{
    int x = 12;
    public void method(int x){
        x += x;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.method(5);//10
    }
}