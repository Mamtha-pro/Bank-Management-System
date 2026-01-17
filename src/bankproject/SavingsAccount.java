package bankproject;


public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double bal){
        super(accNo,name,bal);
    }

    public void withdraw(double amount){
        if(balance - amount >= 1000){
            System.out.println("Withdrawal successful");

        }else{
            System.out.println("Minimum balance required");
        }
    }

    public void calculateInterest(){
        double interest = balance * 0.04;
        balance += interest;
        System.out.println("Saving interest added");
    }

}
