

package bankingsystem;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter savings account number: ");
        int savingsAccountNumber = scanner.nextInt();
        System.out.print("Enter initial savings account balance: ");
        double savingsInitialBalance = scanner.nextDouble();
        System.out.print("Enter savings account interest rate: ");
        double savingsInterestRate = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsInitialBalance, savingsInterestRate);

        System.out.print("Enter checking account number: ");
        int checkingAccountNumber = scanner.nextInt();
        System.out.print("Enter initial checking account balance: ");
        double checkingInitialBalance = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingInitialBalance);

        System.out.print("Enter credit account number: ");
        int creditAccountNumber = scanner.nextInt();
        System.out.print("Enter initial credit account balance: ");
        double creditInitialBalance = scanner.nextDouble();
        System.out.print("Enter credit account credit limit: ");
        double creditLimit = scanner.nextDouble();
        CreditAccount creditAccount = new CreditAccount(creditAccountNumber, creditInitialBalance, creditLimit);

        System.out.println("\nInitial Accounts Information:");
        System.out.println("Savings Account:\n" + savingsAccount.toString());
        System.out.println("Checking Account:\n" + checkingAccount.toString());
        System.out.println("Credit Account:\n" + creditAccount.toString());

        System.out.print("\nEnter the amount to deposit into the savings account: ");
        double savingsDepositAmount = scanner.nextDouble();
        savingsAccount.deposit(savingsDepositAmount);

        System.out.print("Enter the amount to withdraw from the checking account: ");
        double checkingWithdrawAmount = scanner.nextDouble();
        checkingAccount.withdraw(checkingWithdrawAmount);

        System.out.print("Enter the amount to charge to the credit account: ");
        double creditChargeAmount = scanner.nextDouble();
        creditAccount.charge(creditChargeAmount);

        System.out.println("\nFinal Accounts Information:");
        System.out.println("Savings Account:\n" + savingsAccount.toString());
        System.out.println("Checking Account:\n" + checkingAccount.toString());
        System.out.println("Credit Account:\n" + creditAccount.toString());

        scanner.close();
    }
}