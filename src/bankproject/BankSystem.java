package bankproject;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Account Type");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.println("3. Salary Account");

        int choice;

        while (true) {
            System.out.print("Enter your choice (1-3): ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();

                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid account type. Choose 1, 2 or 3.");
                }
            } else {
                System.out.println("Please enter a number.");
                sc.next();
            }
        }


        System.out.println("Account details :");
        System.out.print("Account Number : ");
        String accNo = sc.next();

        System.out.print("Account Name : ");
        String name = sc.next();

        System.out.print("Account Balance : ");
        while (!sc.hasNextDouble()){
            System.out.println("Please enter a valid number");
            sc.next();
        }
        double balance = sc.nextDouble();

        BankAccount account;

        // 🔹 SWITCH instead of if–else (Account Type)
        switch (choice) {
            case 1:
                account = new SavingsAccount(accNo, name, balance);
                break;

            case 2:
                account = new CurrentAccount(accNo, name, balance);
                break;

            case 3:
                account = new SalaryAccount(accNo, name, balance);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("\nChoose Operation :");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Calculate Interest");

        int op = sc.nextInt();

        // 🔹 SWITCH instead of if–else (Operations)
        switch (op) {
            case 1:
                System.out.print("Enter amount to deposit : ");
                double depAmt = sc.nextDouble();
                account.deposit(depAmt);
                break;

            case 2:
                System.out.print("Enter amount to withdraw : ");
                double withAmt = sc.nextDouble();

                boolean result = account.withdraw(withAmt);

                if (result) {
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Withdrawal failed");
                }
                break;


            case 3:
                System.out.println("Balance: " + account.checkBalance());
                break;

            case 4:
                double interest = account.calculateInterest();
                System.out.println("Interest: " + interest);
                break;

            default:
                System.out.println("Invalid operation");
        }

        System.out.println("Final Balance: " + account.checkBalance());

        sc.close();
    }
}





