package map;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author mtreellen
 * @create 2019-10-17-20:10
 */
public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        properties.load(fis);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("name = " + name + ", password = " + password);
        fis.close();
    }
}
