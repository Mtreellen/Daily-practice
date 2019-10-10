//饿汉式2
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){ }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

class EagerSingletonTest{
    public static void main(String[] args) {
        EagerSingleton instance = null;
        instance = EagerSingleton.getInstance();
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