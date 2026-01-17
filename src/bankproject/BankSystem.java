package bankproject;
import java.util.Scanner;
public class BankSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Account Type");
       System.out.println("1.Saving Account :");
        System.out.println("2.Current Account :");
        System.out.println("3.Salary Account :");
        int  choice = sc.nextInt();


        System.out.println("Account details :");
        System.out.println("Account Number :");
        String accNo =sc.next();

        System.out.println("Account Name :");
        String name =sc.next();
        System.out.println("Account balance :");
        double balance = sc.nextDouble();

        BankAccount account;

        if(choice == 1){
           account = new  SavingsAccount(accNo,name,balance);
        }else if(choice  == 2){
            account =new CurrentAccount(accNo,name,balance);

        }else if (choice  ==3){
            account =new SalaryAccount(accNo,name,balance);

        }
        else{
            System.out.println("Invalid Choice");
            return;
        }
        Scanner op = new Scanner(System.in);
        System.out.println("Choose Operation :");
        System.out.println("1. Deposit :");
        System.out.println("2. Withdraw :");
        System.out.println("3. Check Balance :");
        System.out.println("4. Calaculate Interest :");
         int po = op.nextInt();

         if(po == 1){
             System.out.println("Enter the amount to  deposit :");
             double amt =sc.nextDouble();
             account.deposit(amt);
         }
         else if(po == 2){
             System.out.println("Enter the amount to  withdraw :");
             double amt =sc.nextDouble();
             account.withdraw(amt);
         }
         else if(po == 3){
             System.out.println("Balance: " + account.checkBalance());

         }
         else if(po == 4){
             account.calculateInterest();
         }else{
             System.out.println("Invalid operation");
         }
         System.out.println("Final Balance:"+ account.checkBalance());


sc.close();

    }
    }






