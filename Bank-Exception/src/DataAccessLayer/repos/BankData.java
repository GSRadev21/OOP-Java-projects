package DataAccessLayer.repos;

import java.util.HashMap;

public interface BankData {

    HashMap<String,String> bankAccount = new HashMap<>() {{bankAccount.put("123", "Angel"); bankAccount.put("456", "Ivan");}};

    abstract public String getBankAccount(String bankNumber);
    abstract public void addBankAccount(String bankNumber, String holder);
    abstract public void removeBankAccount(String bankNumber);
}
