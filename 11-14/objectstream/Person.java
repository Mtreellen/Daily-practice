package objectstream;

import java.io.Serializable;

/**
 * @author ellen
 * @date 2019-11-12 10:57
 * @description
 * Person 类需要满足：
 *      1.实现 Serializable 接口（标识接口）
 *      2.当前类提供全局常量：serialVersionUID
 */
public class Person implements Serializable {
    private String name;
    transient int age;
    private static String hobbit;
    // 解决序列号冲突异常：InvalidClassException
    public static final long serialVersionUID = 1L;

    public Person(String name, int age, String hobbit) {
        this.name = name;
        this.age = age;
        this.hobbit = hobbit;
    }

    public static String getHobbit() {
        return hobbit;
    }

    public static void setHobbit(String hobbit) {
        Person.hobbit = hobbit;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbite=" + hobbit +
                '}';
    }
}
