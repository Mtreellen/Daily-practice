package exercise.chapter2.exer7;

/**
 * @author mtreellen
 * @create 2019-10-18-14:25
 */
public class Children extends Parent {
    public Children(){
        System.out.println("Children class created");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        Children c = new Children();
    }
}

class Test {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }
}

class Base {
    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
