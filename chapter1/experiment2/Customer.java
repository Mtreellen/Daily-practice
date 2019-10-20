package exercise.chapter1.experiment2;

/**
 * @author mtreellen
 * @create 2019-10-16-16:48
 */
public class Customer {
    private String firtName;
    private String lastName;
    private Account account;

    public Customer(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
