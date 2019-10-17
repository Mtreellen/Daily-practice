package map;

import java.util.*;

/**
 * @author mtreellen
 * @create 2019-10-17-20:02
 */
public class TreeMapTest {
    public static void main(String[] args) {
        //姓名从大到小排序
        test();
        System.out.println("*****************");
        //年龄从小到大排序
        test1();
    }
    public static void test(){
        TreeMap map = new TreeMap();
        User u1 = new User("Elle", 12);
        User u2 = new User("AB", 33);
        User u3 = new User("Hellen", 23);
        User u4 = new User("Gilw", 45);

        map.put(u1, 89);
        map.put(u2, 34);
        map.put(u3, 23);
        map.put(u4, 100);

//        System.out.println(map);
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry  entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
    public static void test1(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        });
        User u1 = new User("Elle", 12);
        User u2 = new User("AB", 33);
        User u3 = new User("Hellen", 23);
        User u4 = new User("Gilw", 45);

        map.put(u1, 89);
        map.put(u2, 34);
        map.put(u3, 23);
        map.put(u4, 100);

//        System.out.println(map);
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry  entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}
