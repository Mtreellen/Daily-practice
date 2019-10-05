
public class DataRange {
    public static void main(String[] args) {

        System.out.println("Short\t 取值范围："+Short.MAX_VALUE+":"+Short.MIN_VALUE);
        System.out.println("Integer\t 取值范围："+Integer.MAX_VALUE+":"+Integer.MIN_VALUE);
        System.out.println("Long\t 取值范围："+Long.MAX_VALUE+":"+Long.MIN_VALUE);
        System.out.println("Float\t 取值范围："+Float.MAX_VALUE+":"+Float.MIN_VALUE);
        System.out.println("Double\t 取值范围："+Double.MAX_VALUE+":"+Double.MIN_VALUE);
        System.out.println("Byte\t 取值范围："+Byte.MAX_VALUE+":"+Byte.MIN_VALUE);
        //System.out.println("Char\t 取值范围："+Char.MAX_VALUE+":"+Char.MIN_VALUE);
        //System.out.println("Boolean\t 取值范围："+Boolean.MAX_VALUE+":"+Boolean.MIN_VALUE);
        //没有Char.MAX_VALUE 和 Boolean.MAX_VALUE 的定义
        //所以只有整型和浮点型有
    }
}