//懒汉式
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
                instance = new LazySingleton();
        }
        return instance;
    }
}
class LazySingletonTest{
    public static void main(String[] args) {
        LazySingleton instance = null;
        instance = LazySingleton.getInstance();
    }
}
