package exercise.chapter2.exer1;

/**
 * @author mtreellen
 * @create 2019-10-16-17:26
 */
public class OverrideTest {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Super s = new Demo15();
        System.out.println(s.get());
    }
}
class Super {
    public int get() {
        return 4;
    }
}

class Demo15 extends Super {
//    public long get() {//编译错误，没有构成重载
    public int get(){
        return 5;
    }
}
