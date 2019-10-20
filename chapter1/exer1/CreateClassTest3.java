package exercise.chapter1.exer1;

/**
 * @author mtreellen
 * @create 2019-10-15-13:47
 */
public class CreateClassTest3 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setIcCard(622926170021213221L);
        customer.setName("Haha");
        customer.setAddress("中国-西藏-南木林");
        customer.setTel(123_1234_1245L);

        Account account = new Account();
        account.setCid(1001);
        account.setBalance(10000);
        account.setCustomer(customer);
        System.out.println(account.getInfo());
        account.save(1000);
        account.withdraw(5000);
        System.out.println(account.getInfo());
    }
}

class Account{
    private int cid;
    private double balance;
    private Customer customer;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getInfo(){
        return "Account { " + "cid: " + cid + " balance: " + balance + " customer: " + customer.say() + " }";
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足，取钱失败");
            return false;
        }
        balance -= amount;
        System.out.println("余额为" + balance);
        return true;
    }

    public boolean save(double amount){
        if(amount <= 0){
            System.out.println("输入存款金额不合法");
            return false;
        }
        balance += amount;
        System.out.println("余额为" + balance);
        return true;
    }
}

class Customer{
    private String name;
    private long IcCard;
    private String address;
    private long tel;

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIcCard() {
        return IcCard;
    }

    public void setIcCard(long icCard) {
        IcCard = icCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String say(){
        return "[ " + "name: " + name + " IcCard: " + IcCard + " address: "
                + address + " tel: " + tel + " ]";
    }
}