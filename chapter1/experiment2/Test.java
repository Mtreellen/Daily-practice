package exercise.chapter1.experiment2;

/**
 * @author mtreellen
 * @create 2019-10-16-16:58
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(450);

        System.out.println("客户" + bank.getCustomer(0).getFirtName() + "的余额为：" + bank.getCustomer(0).getAccount().getBalance());

        bank.addCustomer("哈哈", "马");

        System.out.println("银行的账户有：" + bank.getNumberOfCustomers() + "个");
    }
}
