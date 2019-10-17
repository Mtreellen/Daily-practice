package map;

import java.util.*;

/**
 * @author mtreellen
 * @create 2019-10-11-14:58
 */
public class MapTest {
    public static void main(String[] args) {
//        test();
        test1();
    }
    public static void test(){
        Map map =  new HashMap();
        map.put("abc", 123);
        map.put(23, 23);
        map.put(false, 123);
        map.put("abc",34);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("as", 123);
        map1.put(23,"hehe");

        map.putAll(map1);
        System.out.println(map);
        System.out.println(map1);

        System.out.println(map.remove(23));
        System.out.println(map);
        System.out.println(map.get("as"));
        map.clear();
        System.out.println(map.size());//0
        System.out.println(map);//{}
    }
    public static void test1(){
        Map map =  new HashMap();
        map.put("abc", 123);
        map.put(23, 23);
        map.put(false, 123);
        map.put("abc",34);
        System.out.println(map);
        //keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection values = map.values();
        for (Object obj : values){
            System.out.println(obj);
        }

        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()){
//            System.out.println(iterator.next());//error
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry)next;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

    }
}
