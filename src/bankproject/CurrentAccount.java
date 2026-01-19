package bankproject;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public boolean withdraw(double amount) {
        if (balance + 5000 >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double calculateInterest() {
        return 0.0;
    }
}

