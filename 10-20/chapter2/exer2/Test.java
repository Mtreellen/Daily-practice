package exercise.chapter2.exer2;

/**
 * @author mtreellen
 * @create 2019-10-16-17:33
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Faculty();
        Person p1 = new Staff();

        if(p instanceof Faculty){
            Faculty f = (Faculty)p;
            f.setDegree("本科");
            System.out.println(f.getDegree());
        }
        if(p1 instanceof Staff){
            Staff s = (Staff)p1;
            s.setDuty("职员");
            System.out.println(s.getDuty());
        }
    }
}
