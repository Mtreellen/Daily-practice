package otherstream;

import java.io.*;

/**
 * @author ellen
 * @date 2019-11-14 11:45
 * @description
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
//        test1();
        test2();
    }
    public static void test1() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("IO\\src\\z_filesrc\\data.txt"));
        dos.writeUTF("莫妮卡");
        dos.flush();
        dos.writeInt(21);
        dos.flush();
        dos.writeDouble(45.3);
        dos.flush();
        dos.writeBoolean(true);

        dos.close();
    }
    public static void test2() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("IO\\src\\z_filesrc\\data.txt"));

        String name = dis.readUTF();
        int age = dis.readInt();
        double height = dis.readDouble();
        boolean isFemale = dis.readBoolean();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("isFemale = " + isFemale);

    }
}
