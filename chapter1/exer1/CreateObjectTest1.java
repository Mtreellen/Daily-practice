package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-15:59
 */
public class CreateObjectTest1 {
}

class Test1 {
    public static void main(String[] args) {
        new A(new B());
    }
}

class A{
    public A(){
        System.out.println("A");
    }
    public A(B b){
        this();
        System.out.println("AB");
    }
}

class B{
    public B(){
        System.out.println("B");
    }
}
