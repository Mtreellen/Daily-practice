package exercise.chapter1.experiment1;

/**
 * @author mtreellen
 * @create 2019-10-16-16:25
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account() {}

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){//取钱
        if(balance < amount){
            System.out.println("余额不足，取钱失败。");
            return;
        }
        balance -= amount;
        System.out.println("成功取出" + amount + "元。");
    }

    public void deposit(double amount){//存钱
        if(amount <= 0){
            System.out.println("存钱金额不合法，存钱失败");
            return;
        }
        balance += amount;
        System.out.println("成功存入" + amount + "元。");
    }

    @Override
    public String toString() {
        return "{ " +
                "id = " + id +
                ", balance = " + balance +
                ", annualInterestRate = " + annualInterestRate +
                '}';
    }
}
