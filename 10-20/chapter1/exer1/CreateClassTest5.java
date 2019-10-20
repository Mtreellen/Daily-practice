package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-15:08
 */
public class CreateClassTest5 {
    public static void main(String[] args) {
//        testDog();
        testPoint();
    }
    public static void testDog(){
        Dog dog = new Dog("collie", "white",2);
        System.out.println(dog.show());
    }
    public static void testPoint(){
        Point p = new Point(0, 4);
        System.out.println("当前坐标：" + p.showCoordinate());
        System.out.println("当前点到原点的距离" + p.getDistance());
        System.out.println("当前点到(3, 1)的距离" + p.getDistance(3, 1));
        System.out.println("当前点到p的距离" + p.getDistance(new Point(0, 3)));
    }
}

class Dog{
    private String name;
    private String color;
    private int age;

    public Dog(){}

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String show(){
        return "Dog{ name: " + name + ", age: " + age + ", color: " + color + " }";
    }
}

class Point{
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.sqrt((x * x + y * y));
    }

    public double getDistance(int m, int n){
        return Math.sqrt(((x - m) * (x - m)) + ((y - n) + (y - n)));
    }

    public double getDistance(Point p){
        return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) + (y - p.y)));
    }

    public String showCoordinate(){
        return "( x, " + "y )";
    }
}