package bankproject;


public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double bal){


        super(accNo,name,bal);
    }

    public boolean withdraw(double amount){
        if( amount <= balance){
            balance -= amount;
            return true;

        }
        return false;
    }

    public double calculateInterest(){
      return balance *0.04;
    }

}
