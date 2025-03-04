package DataAccessLayer.models;

import DataAccessLayer.repos.BankData;
import Exceptions.InvalidAmountException;
import javax.security.auth.login.AccountNotFoundException;

public class BankAccount implements BankData {

    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Features that the account holder will possess

    public void getBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void addToBalance(double value) {

        balance += value;
    }

    public void subFromBalance(double value) throws InvalidAmountException {
        double oldBalance = balance;
        if(balance < value) {
            throw new InvalidAmountException();
        } else {
            balance -= value;
            System.out.println("You successfully subtract " + value + " from " + oldBalance);
            System.out.println("Your balance is " + balance);
        }
    }

    public void transferMoney(double amount, String bankNumber) throws InvalidAmountException, AccountNotFoundException {

        if(getBankAccount(bankNumber) != null) {
            if (amount > balance) {
                throw new InvalidAmountException();
            } else {
                balance -= amount;
                System.out.println("You successfully transfer " + amount + " to " + bankNumber);
            }
        } else {

           throw new AccountNotFoundException();
        }
    }

    @Override
    public String getBankAccount(String bankNumber) {
        return BankData.bankAccount.get(bankNumber);
    }

    @Override
    public void addBankAccount(String bankNumber, String holder) {
        BankData.bankAccount.put(bankNumber,holder);
    }

    @Override
    public void removeBankAccount(String bankNumber) {
        BankData.bankAccount.remove(bankNumber);
    }
}
