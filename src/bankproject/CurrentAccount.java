package bankproject;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accNo, String name, double bal){
        super(accNo, name, bal);

    }
    public void withdraw(double amount){
        if(balance + 5000 >= amount){
            balance -= amount;
            System.out.println("Withdrawal sucessful");
        }else{
            System.out.println("Overdraft limit exceeded");
        }
    }
    public void calculateInterest() {
        System.out.println("No interest for current account");
    }
}
