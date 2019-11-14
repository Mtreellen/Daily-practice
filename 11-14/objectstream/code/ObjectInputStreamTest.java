package objectstream.code;

import objectstream.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author ellen
 * @date 2019-11-12 11:02
 * @description：对象的反序列化流，ObjectInputStream
 * java.io.ObjectInputStream extends InputStream
 *     ObjectInputStream:对象的反序列化流
 *     作用:把文件中保存的对象,以流的方式读取出来使用
 *
 *     构造方法:
 *         ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
 *         参数:
 *             InputStream in:字节输入流
 *     特有的成员方法:
 *         Object readObject() 从 ObjectInputStream 读取对象。
 *
 *     使用步骤:
 *         1.创建ObjectInputStream对象,构造方法中传递字节输入流
 *         2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
 *         3.释放资源
 *         4.使用读取出来的对象(打印)
 *
 *      readObject方法声明抛出了ClassNotFoundException(class文件找不到异常)
 *      当不存在对象的class文件时抛出此异常
 *      反序列化的前提:
 *         1.类必须实现Serializable
 *         2.必须存在类对应的class文件
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\src\\object\\person.txt"));

        // ClassNotFoundException
        Object o = ois.readObject();
        String s = (String)o;
        Object o1 = ois.readObject();
        Person p = (Person)o1;
        System.out.println(s);
        System.out.println(p);
        ois.close();
        // age 为 transient， 不被序列化
        // hobbit 变量为 static 不被序列化
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getHobbit());
    }
}
