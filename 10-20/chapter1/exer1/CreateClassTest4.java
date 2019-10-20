package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-14:58
 */
public class CreateClassTest4 {
    public static void main(String[] args) {
        Box box = new Box(1.2, 3.0, 3);
        System.out.println(box.volume());
    }
}

class Box{
    private double longth;
    private double width;
    private double height;

    public Box(){}

    public Box(double longth, double width, double height){
        this.longth = longth;
        this.width = width;
        this.height = height;
    }

    public double volume(){
        return longth * width * height;
    }
}