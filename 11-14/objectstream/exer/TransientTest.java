package objectstream.exer;

/**
 * @author ellen
 * @date 2019-11-12 11:08
 * @description：transient关键字
 * static关键字:静态关键字
 *         静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
 *         被static修饰的成员变量不能被序列化的,序列化的都是对象
 *         private static int age;
 *         oos.writeObject(new Person("小美女",18));
 *         Object o = ois.readObject();
 *         Person{name='小美女', age=0}
 *
 *     transient关键字:瞬态关键字
 *         被transient修饰成员变量,不能被序列化
 *         private transient int age;
 *         oos.writeObject(new Person("小美女",18));
 *         Object o = ois.readObject();
 *         Person{name='小美女', age=0}
 */
public class TransientTest {
}
