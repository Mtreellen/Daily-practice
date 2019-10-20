package exercise.chapter2.exer6;

/**
 * @author mtreellen
 * @create 2019-10-17-11:17
 */
public abstract class Vehicle {
    public abstract void move();
}
class Car extends Vehicle{
    public void move(){
        System.out.println("在陆地行驶");
    }
}
class Plane extends Vehicle{
    public void move(){
        System.out.println("在空中飞翔");
    }
}
class Steamer extends Vehicle{
    public void move(){
        System.out.println("在海上航行");
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.move();

        Car car = new Car();
        car.move();
    }
}