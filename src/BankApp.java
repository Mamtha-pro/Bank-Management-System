
interface BankOperations {
    void setAccountHolder(String name);
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class Account implements BankOperations {

    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " Rs");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " Rs");
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {

        BankOperations account = new Account();

        account.setAccountHolder("Deepak");
        account.deposit(10000);
        account.withdraw(3000);

        System.out.println("Current Balance: " + account.checkBalance() + " Rs");
    }
}
