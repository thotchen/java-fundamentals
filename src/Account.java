public class Account {

    private String name;
    private double balance;


    public Account(String name) {
        this.name = name;
    }

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        if (deposit > 0.0) {
            balance = balance + deposit;
        }
    }

    public void withdraw(double withdraw) {
        if (withdraw > 0.0) balance = balance - withdraw;
    }
}
