// (4) Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, 
// Also create methods getAccountDetails() and displayAccountDetails().


import java.util.Scanner;

    public class BankAccount {
        public static void main(String[] args) {
            Bank_Account b1 = new Bank_Account();
            b1.getAccountDetails();
            b1.displayAccountDetails();
        }
    }

 class Bank_Account {

        String accountNo;
        String userName;
        String email;
        String accountType;
        Double accountBalance;

        void getAccountDetails(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Account number: ");
            accountNo = sc.nextLine();
            System.out.println("Enter your user name: ");
            userName = sc.nextLine();
            System.out.println("Enter your Email: ");
            email = sc.nextLine();
            System.out.println("Enter your Account Type: ");
            accountType = sc.nextLine();
            System.out.println("Enter your Account Balance: ");
            accountBalance = sc.nextDouble();   
            sc.close(); 
        }
        
        void displayAccountDetails(){
            System.out.println(accountNo);
            System.out.println(userName);
            System.out.println(email);
            System.out.println(accountType);
            System.out.println(accountBalance);
        }
        
    }
    
