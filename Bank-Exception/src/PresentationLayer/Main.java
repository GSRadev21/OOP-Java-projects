package PresentationLayer;

import DataAccessLayer.models.BankAccount;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws AccountNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account's balance: ");
        double balance = sc.nextDouble();
        BankAccount bankAccount = new BankAccount(balance,accountNumber);
        int option;
        System.out.println("Choose the operation");

        System.out.println("1. Get balance");
        System.out.println("2. Add to balance");
        System.out.println("3. Subtract from balance");
        System.out.println("4. Transfer to balance");
        System.out.println("5. View account");
        System.out.println("6. Add new account");
        System.out.println("7. Remove account");
        switch (option = sc.nextInt()) {
            case 1: bankAccount.getBalance();
            break;
            case 2: bankAccount.addToBalance(balance);
            break;
            case 3: System.out.println("Enter the amount: ");
                double amount = sc.nextDouble();
                bankAccount.subFromBalance(amount);
            break;
            case 4: System.out.println("Enter the amount: ");
                double amount2 = sc.nextDouble();
                bankAccount.transferMoney(amount2,accountNumber);
                break;
            case 5: bankAccount.getBankAccount(accountNumber);
            break;
            case 6: System.out.println("Enter the holder name: ");
            String holder = sc.nextLine();
            bankAccount.addBankAccount(accountNumber,holder);
            break;
            case 7: bankAccount.removeBankAccount(accountNumber);
            break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}