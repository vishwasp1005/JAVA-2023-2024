import java.rmi.server.ExportException;
import java.util.Scanner;

public class BankBalanceInsuficient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account ac = new Account(20000);

        System.out.println("Enter 1 for Withdraw and 2 for Deposite your money: ");
        int n = sc.nextInt();
         try{
        if(n==1){
            System.out.println("Enter a amount to withrow: ");
            int widr = sc.nextInt();
            ac.Withdraw(widr);
        }
        else if(n==2){
            System.out.println("Enter a amount to deposite: ");
            int dep = sc.nextInt();
            ac.deposit(dep);
        }
         }
         catch(InsuficientBalanceException e){
            e.printStackTrace();
         }
    }
}

class InsuficientBalanceException extends Exception {
    public InsuficientBalanceException(String s) {
        super(s);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully Deposited " + amount + " in your Account.");
        System.out.println("================================================================");
        System.out.println("Balance: "+balance);        
    }

    public void Withdraw(double amount) throws InsuficientBalanceException{
        if (amount > balance) {
            throw new InsuficientBalanceException("Bhai Chadar jetli hoi ne etla j pag felavai...");
        } else {
            balance -= amount;
            System.out.println("Successfully Withdrawed " + amount + "from your Account");
            System.out.println("================================================================");
            System.out.println("Balance: "+balance);        
        }
    }
}