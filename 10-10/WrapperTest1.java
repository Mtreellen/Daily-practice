import org.omg.PortableInterceptor.INACTIVE;

public class WrapperTest1 {
    public static void main(String[] args) {
        WrapperTest1 wrapper = new WrapperTest1();

        wrapper.test();
        System.out.println("----------------");
        wrapper.test1();
        System.out.println("----------------");
        wrapper.test2();
        System.out.println("----------------");
        wrapper.test3();
    }

    public void test(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        //Object o1 = new Integer(1);

        System.out.println(o1);//1.0
        // --三元运算符，数据类型要一致，所以自动类型提升了 Integet --> Double
    }

    public void test1(){
        Object o2;
        if(true){
            o2 = new Integer(1);
        }else
            o2 = new Double(2.0);
        System.out.println(o2);//1
    }

    public void test2(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
        /*
                Integer中定义了一个内部类IntegerCatch
        --》    里面有一个数组static final Integer catch[];
        --》    存了 -128到127范围的数组  --》  为了提高速度
         */
    }

    public void test3(){
        int[] arr = new int[]{1, 2, 3};
        char[] arr1 = new char[]{'1', '2', '3'};

        System.out.println(arr);//[I@1b6d3586
        System.out.println(arr1);//123
    }
}