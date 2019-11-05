package compare.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * @author mtreellen
 * @date 2019-11-05 11:17
 * @description
 */
public class Person {
    private String name;
    private Integer age;
    private Integer height;
    private boolean isAdult;

    public Person() {
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height = " + height +
                ", age = " + age +
                '}';
    }
}

class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
class Test{
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Person[] people = new Person[5];
        Random random = new Random(20191105);
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].setHeight(random.nextInt(100));
            people[i].setAge(random.nextInt(100));
        }

        System.out.println(Arrays.toString(people));
        selectionSort(people, new PersonComparator());
        System.out.println(Arrays.toString(people));
    }
    public static void selectionSort(Person[] arr, Comparator cm){
        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
            Person minPerson = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(cm.compare(arr[j], minPerson) < 0){
                    minIndex = j;
                    minPerson = arr[j];
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minPerson;
            }
        }
    }
}