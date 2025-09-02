// 2. Create a Java class BankAccount with accountNumber, accountHolderName, and balance. Include methods to deposit, withdraw, and display balance. Use a BankDemo class to test all methods.


import java.util.Scanner;


class BankAccount {

    String accountHolderName;
    int accountNumber;
    double balance;


    void setDetails(String name, int accNo, double initialBalance) {
        accountHolderName = name;
        accountNumber = accNo;
        balance = initialBalance;
    }


    void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }


    void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balancr: " + balance);
    }

}


public class pr4_2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();


        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        account.setDetails(name, accNo, initialBalance);

        // Perform deposit
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Perform withdrawal
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final balance
        System.out.println("\nFinal Account Details:");
        account.displayBalance();

        sc.close();

    }
}