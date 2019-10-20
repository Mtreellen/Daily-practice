package exercise.chapter2.exer5;

/**
 * @author mtreellen
 * @create 2019-10-17-11:02
 */
public class Employee {
    private String name;
    private int id;
    private double salary;
    private double coefficient;

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double bonus(){
        return this.coefficient * this.salary;
    }
}
class Manager extends Employee{

/*    public double bonus(){
        return this.getCoefficient() * this.getSalary();
    }*/

}
class GeneralEmployee extends Employee{
/*    public double bonus(){
        return this.getCoefficient() * this.getSalary();
    }*/
}

class Test{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setCoefficient(2);
        System.out.println("经理的奖金系数：" + manager.getCoefficient());

        GeneralEmployee general = new GeneralEmployee();
        general.setCoefficient(1.5);
        System.out.println("普通员工的奖金系数：" + general.getCoefficient());

        Employee employee = new Employee();
        System.out.println(employee.getCoefficient());

        manager.setSalary(20000);
        general.setSalary(8000);

        System.out.println("经理的工资：" + manager.bonus());
        System.out.println("普通员工的工资：" + general.bonus());

    }
}