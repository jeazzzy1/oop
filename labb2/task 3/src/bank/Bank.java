package bank;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }
    public void closeAccount(int accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accountNumber);
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount savingsAccount) {
                savingsAccount.calculatePercent(); // добавляем проценты
            } else if (account instanceof CheckingAccount checkingAccount) {
                checkingAccount.deductfee(); // взимаем плату за транзакции
            }
        }
    }


    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}
