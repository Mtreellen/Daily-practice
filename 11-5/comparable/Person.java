package compare.comparable;

/**
 * @author mtreellen
 * @date 2019-11-05 9:59
 * @description
 */
public class Person implements Comparable<Person>{
    private String name;
    private Integer age;
    private Boolean isAdult;

    public Person() {
    }

    public Person(String name, Integer age, Boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAdult() {
        return isAdult;
    }

    public void setAdult(Boolean adult) {
        isAdult = adult;
    }

    /**
     *
     * @param o
     * @return
     *          res < 0 : this指向的 Person 小于 o 指向的 Person
     *          res == 0 : 表示两对象相等
     *          res > 0 : this指向的 Person 大于 o 指向的 Person
     */
//    @Override
//    public int compareTo(Object o) {
//        if(o == null){
//            return -2;
//        }
//        if(o instanceof Person){
//            Person p = (Person)o;
//            return Integer.compare(this.getAge(), p.getAge());
//        }
//        return -2;
//    }

    @Override
    public int compareTo(Person o) {
        if(this.age < o.age){
            return -1;
        }if(this.age > o.age){
            return 1;
        }else{
            return 0;
        }
//        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                " age=" + age +
                "}";
    }
}
