package FolksDev.CleanCode.AnemicDomainModel.badWay;

import FolksDev.CleanCode.Atm.Exceptions.InsufficentBalanceException;

public class AccountServiceBad {

    private static final double EFT_CHARGE = 3;

    public void withdraw(AccountBad account, double amount) throws InsufficentBalanceException {
        double balance = account.getBalance();
        if (balance >= amount) {
            balance -= amount;
            account.setBalance(balance);
        } else {
            throw new InsufficentBalanceException(account.getIban(), balance, amount);
        }
    }

    public void deposit(AccountBad account, double amount) throws InsufficentBalanceException {
        double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
    }

    public void eft(AccountBad sourceAccount, AccountBad targetAccount, double amount) throws InsufficentBalanceException {
        withdraw(sourceAccount, amount);
        withdraw(sourceAccount, EFT_CHARGE);
        deposit(targetAccount, amount);
    }
}
