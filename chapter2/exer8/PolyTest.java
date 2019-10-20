package exercise.chapter2.exer8;

/**
 * @author mtreellen
 * @create 2019-10-18-14:36
 */
class A {
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class B extends A {
    private int a;

    public void setA(int a) {
        this.a = a;
    }
    // public int getA(){
    // return a;
    // }
}

public class PolyTest {
    public static void main(String[] args) {
        A c = new B();
        c.setA(5);
        System.out.println(c.getA());//0
    }
}


class Fu {
    boolean show(char a) {
        System.out.println(a);
        return true;
    }
}

class Demo extends Fu {
    public static void main(String[] args) {
        int i = 0;
        Fu f = new Demo();
        Demo d = new Demo();
        for (f.show('A'); f.show('B') && (i < 2); f.show('C')) {
            i++;
            d.show('D');
        }
    }
    boolean show(char a) {
        System.out.println(a);
        return false;
    }
}
class P {
    int num = 4;

    void show() {
        System.out.println("showFu");
    }
}

class Zi extends P {
    int num = 5;

    void show() {
        System.out.println("showZi");
    }
}

class T {
    public static void main(String[] args) {
        P f = new Zi();
        Zi z = new Zi();
        System.out.println(f.num);//4
        System.out.println(z.num);//5
        f.show();//showZi
        z.show();//showZi
    }
}

