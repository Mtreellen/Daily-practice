package exercise.chapter1.experiment2;

/**
 * @author mtreellen
 * @create 2019-10-16-16:50
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[10];
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f, l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers(){
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
/*        if(index == numberOfCustomer){
            return customers[numberOfCustomer];
        }
        return null;*/

        if (index < numberOfCustomer || index >= 0) {
            return customers[index];
        }
        return null;
    }

}
