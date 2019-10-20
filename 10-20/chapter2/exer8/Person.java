package exercise.chapter2.exer8;

/**
 * @author mtreellen
 * @create 2019-10-18-14:28
 */
public class Person {
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String say(){
        return "姓名：" + name + ", 年龄：" + age;
    }
}
class Student extends Person{
    private int id;
    private double score;

    public Student(){}
    public Student(String name, int age, int id, double score){
        super(name, age);
        this.id = id;
        this.score = score;
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
        return "姓名：" + super.getName() + ", 年龄：" + super.getAge() + "，学号：" + id
                + ", 成绩：" + score;
    }
}
class Test{
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34);
        Student student = new Student("Tom", 34, 12, 34);

        System.out.println(tom.say());
        System.out.println(student.say());
    }
}