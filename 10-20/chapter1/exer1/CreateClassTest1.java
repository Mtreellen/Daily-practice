package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-13:22
 */
public class CreateClassTest1 {
    public static void main(String[] args) {
//        testStudent();
//        testPerson();
//        testCar();
        testCourse();
    }
    public static void testStudent(){
        Student stu = new Student();
        stu.setAge(12);
        stu.setName("Apple");
        stu.setGender("woman");
        stu.setId(1001);
        stu.setScore(90);
        System.out.println(stu.say());
    }
    public static void testPerson(){
        Person p = new Person("张三", "男", 38);
        p.eat();
        System.out.println(p.introduce());
    }
    public static void testCar(){
        Car car1 = new Car("捷达", 3.2, "white", 1000000);
        Car car2 = new Car("宝马", 3.2, "blank", 2000000);
        Car car3 = new Car("劳斯莱斯", 3.2, "red", 2300000);
        Car car4 = new Car("科鲁兹", 3.2, "purple", 1300000);
        Car car5 = new Car("迈锐宝", 3.2, "yellow", 3200000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
    public static void testCourse(){
        Course course1 = new Course("c语言", 23, "Machel");
        Course course2 = new Course("java编程", 34, "Ellen");
        Course course3 = new Course("php网络编程", 23, "Joey");
        Course course4 = new Course("c++", 10, "Mary");
        Course course5 = new Course("数据结构", 23, "Rose");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);
        System.out.println(course5);

    }
}

class Student{
    private String name;
    private String gender;
    private int age;
    private int id;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return "Student { name = " + name + ", gender = " + gender +  ", age = " + age + ", id = "
                + id + ", score = " + score + " }";
    }
}

class Person{
    private String name;
    private String gender;
    private int age;

    public Person(){}

    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String introduce(){
        return "我是" + name + ",我的性别是" + gender + ",我今年" + age + "岁。";
    }
    public void eat(){
        System.out.println("吃饭");
    }
}

class Car{
    private String brand;
    private double longth;
    private String color;
    private double price;

    public Car() {}

    public Car(String brand, double longth, String color, double price) {
        this.brand = brand;
        this.longth = longth;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", longth=" + longth +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class Course{
    private String cNo;
    private double period;
    private String teacher;

    public Course(){}

    public Course(String cNo, double period, String teacher) {
        this.cNo = cNo;
        this.period = period;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cNo='" + cNo + '\'' +
                ", period=" + period +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}