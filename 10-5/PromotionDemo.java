public class PromotionDemo{
    public static void main(String[] args) {
        //自动类型转换1
        // byte b = 10;
        // char c = 'q';
        // int i = 222;
        // long l = 333L;
        // float f = 1.222f;
        // double d = 3.1415926;
        // float f1 = f * b;
        // int i1 = c + i;
        // //char x = b + c;
        // long l1 = l + i1;
        // double d1 = f1/i1 - d;
        //数据类型不同时，转换为相同的再计算，转换规则：byte->short->int->long->float->double,,char->int->long->float->double
        //System.out.print(f1+"\t"+i1+"\t"+l1+"\t"+d1+"\t");
        
        //2
        // int i = 222;
        // char c = 'q';
        // int i1 = i + c;
        // System.out.println(i1);//325

        //3
        // int a = 10;
        // double b = 1.1;
        // b = b + a;
        // a = a + (int)b;
        // System.out.println(b);
        // System.out.println(a);
        // System.out.println(a+b);

        //强制类型转换：将高级别的类型赋值给低级别的类型时
        int a = 110;
        short b = (short)a;
        
        short c = 2334;

        int d = (int)-1.1;
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);


    }
}