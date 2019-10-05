class A {
    public A() {
        System.out.println("1.A类的构造方法");
    }
    {
        System.out.println("2.A类的构造块");
    }
    static {
        System.out.println("3.A类的静态代码块");
    }
}
public class AliCode_1 extends A {
    public AliCode_1() {
        System.out.println("4.B类的构造方法");
    }
    {
        System.out.println("5.B类的构造块");
    }
    static {
        System.out.println("6.B类的静态块");
    }
    public static void main(String[] args) {
        System.out.println("7.start--------");
        new AliCode_1();
        new AliCode_1();
        System.out.println("8.end--------");

    }
}