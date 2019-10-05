class Person {
    public Person() {
        System.out.println("1.Person类的构造方法");
    }

    {
        System.out.println("2.Person类的构造块");
    }

    static {
        System.out.println("3.Person类的静态块");
    }
}

class Student extends Person {
    public Student() {
        System.out.println("4.Student类的构造方法");
    }

    {
        System.out.println("5.Student类的构造块");
    }

    static {
        System.out.println("6.Student类的静态块");
    }
}

public class AliCode {
    public static void main(String[] args) {
        System.out.println("7.start-----------------------");
        new Student();
        new Student();
        System.out.println("8.end-------------------------");
    }
}