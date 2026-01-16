class BankAccount {


    private String accountNumber;
    private String name;
    private double balance;

    // When we create a new bank account
    BankAccount(String accNo, String personName, double money) {
        accountNumber = accNo;
        name = personName;
        balance = money;
    }


    void deposit(double money) {
        if (money > 0) {
            balance = balance + money;
            System.out.println("Money added ");
        } else {
            System.out.println("You cannot add negative money ");
        }
    }


    void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance = balance - money;
            System.out.println("Money taken ");
        } else {
            System.out.println("Not enough money or wrong amount ");
        }
    }


    double checkBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {

        // Create a new bank account
        BankAccount myAccount = new BankAccount(
                "101",
                "Mamatha",
                1000
        );

        myAccount.deposit(500);     // add money
        myAccount.withdraw(300);
        myAccount.withdraw(5000);

        System.out.println("My Money = " + myAccount.checkBalance());
    }
}git