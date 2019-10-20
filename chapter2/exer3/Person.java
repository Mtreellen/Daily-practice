package exercise.chapter2.exer3;

import java.util.Date;

/**
 * @author mtreellen
 * @create 2019-10-16-17:43
 */
public class Person {
    private String name;
    private long idCard;
    private char gender;
    private String censusRegister;//户籍
    private Date birthday;

    public Person() {}

    public Person(String name, long idCard, char gender, String censusRegister, Date birthday) {
        this.name = name;
        this.idCard = idCard;
        this.gender = gender;
        this.censusRegister = censusRegister;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return "{ 身份证号：" + idCard + ", 姓名：" + name + ", 户籍：" + censusRegister + " }";
    }

    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Person){
            Person p = (Person) obj;
            return p.idCard == this.idCard && p.name == this.name;
        }
        return false;
    }
}
class Test{
    public static void main(String[] args) {
        Person p1 = new Person("哈哈", 622_926_1800_0325_0000L, '女',
                "中国-黑龙江",new Date(1990-3-25));
        Person p2 = new Person("嘿嘿", 622_926_1800_0325_0000L, '女',
                "中国-黑龙江",new Date(1990-3-25));
        Person p3 = new Person("哈哈", 622_926_1800_0325_0000L, '男',
                "美国-纽约",new Date(1000-12-1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
    }
}