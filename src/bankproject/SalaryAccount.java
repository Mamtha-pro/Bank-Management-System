package bankproject;

public class SalaryAccount extends BankAccount {

    public SalaryAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void calculateInterest() {
        double interest = balance * 0.03;
        balance += interest;
        System.out.println("Salary interest added");
    }
}
