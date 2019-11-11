package design_pattern;

/**
 * @author mtreellen
 * @create 2019-11-10-19:12
 */
public class Singleton {
    public static void main(String[] args) {
        //LazySingleton test
        LazySingleton instance = null;
        instance = LazySingleton.getInstance();

        //EagerSinleton test
        EagerSingleton instance1 = null;
        instance1 = EagerSingleton.getInstance();
    }
}

//饿汉式
class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){ }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

//饿汉式2：使用了静态代码块
class EagerSingleton1{
    private EagerSingleton1(){}
    private static EagerSingleton1 instance = null;
    static {
        instance = new EagerSingleton1();
    }
    public static EagerSingleton1 getInstance(){
        return instance;
    }
}
//懒汉式
class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
