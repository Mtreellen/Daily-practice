package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-14:07
 */
public class MethodTest1 {
    public static void main(String[] args) {
        testCylinder();
    }
    public static void testCylinder(){
        Cylinder cylinder = new Cylinder();

        cylinder.setInfo(2.1, 3.2);
        System.out.println("底面圆半径：" + cylinder.findArea());
        System.out.println("圆柱体体积：" + cylinder.findVolume());
        System.out.println(cylinder.getInfo());
    }
    public static void testCircle(){
        Circle circle = new Circle(1.2);
        System.out.println("圆的面积为：" + circle.findArea());
        System.out.println("圆的周长为：" + circle.findGirth());
    }
}

class Cylinder {
    private double radius;//底边半径
    private double height;//高

    public void setInfo(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public boolean method(double radius, double height){
        if (radius <= 0 || height <= 0) {
            System.out.println("赋值失败");
            return false;
        }else{
            this.radius = radius;
            this.height = height;
            System.out.println("radius = " + radius + " height = " + height);
            return true;
        }

    }
    //圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
    public String getInfo(){
        return "圆柱体的底边的半径是" + radius + "，高是" + height + "，体积是" + findArea();
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
    public double findVolume(){
        return findArea() * height;
    }
}

class Circle{
    private double radius;

    public  Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius;
    }
    public double findGirth(){
        return 2 * Math.PI * radius;
    }
}