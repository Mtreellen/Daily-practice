package exercise.chapter1.experiment2;

/**
 * @author mtreellen
 * @create 2019-10-16-16:46
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足，存款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出" + amount + "元");
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存入" + amount + "元");
    }
}
