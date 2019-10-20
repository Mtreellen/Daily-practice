package exercise.chapter1.experiment1;

/**
 * @author mtreellen
 * @create 2019-10-16-16:34
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.deposit(2000);

        System.out.println(customer.getFirtName() + " has " + account.getBalance() + "￥");
        System.out.println(customer);

    }
}
