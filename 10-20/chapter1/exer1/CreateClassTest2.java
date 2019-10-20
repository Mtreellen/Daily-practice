package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-13:33
 */
public class CreateClassTest2 {
    public static void main(String[] args) {
        Wife wife = new Wife();
        Husband husband = new Husband();
        wife.setName("Anna");
        wife.setAge(30);
        wife.setHusband(husband);

        husband.setName("Joe");
        husband.setAge(28);
        husband.setWife(wife);

        System.out.println(wife.getInfo());
        System.out.println(husband.getInfo());
    }
}

class Wife{
    private String name;
    private Integer age;
    private Husband husband;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getInfo(){
        return "{ name = " + name + ", age = " + age + ", husband's name = "
                + husband.getName() + ", husband'age = " + husband.getAge() + " }";
    }
}

class Husband{
    private String name;
    private Integer age;
    private Wife wife;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String getInfo(){
        return "{ name = " + name + ", age = " + age + ", wife's name = "
                + wife.getName() + ", wife'age = " + wife.getAge() + " }";
    }
}