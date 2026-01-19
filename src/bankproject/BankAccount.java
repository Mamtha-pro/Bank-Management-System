package bankproject;
public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accNo,String name,double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    public void deposit(double amount){
        if(amount >0){
            balance = balance + amount;
            System.out.println("Amount deposited ");
        }else{
            System.out.println("Invalid amount");
        }
    }

    public double checkBalance(){

        return balance;
    }

    public abstract  boolean withdraw (double amount);
    public abstract double calculateInterest();

}
