package exercise.chapter2.exer4;

/**
 * @author mtreellen
 * @create 2019-10-17-10:53
 */
public class Vehicle {
    private int wheels;
    private double weight;//车的重量

    public Vehicle(){}

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
class Car extends Vehicle{
    private int loader;//载人数

    public Car(){}

    public Car(int loader){
        this.loader = loader;
    }

//    public Car(int wheels, double weight, int loader) {
//        super(wheels, weight);
//        this.loader = loader;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                '}';
    }
}
class Truck extends Car{
    private double payload;//载重量

   /* public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }*/
   public Truck(double payload){
       this.payload = payload;
   }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, 1200.0);
        Car car = new Car(7);
        Truck truck = new Truck(5000);
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(truck);

    }
}