package FolksDev.CleanCode.Atm;

import FolksDev.CleanCode.Atm.Exceptions.InsufficentBalanceException;
import FolksDev.CleanCode.Atm.Exceptions.NegativeAmountException;

public class Account {

    private int id;
    private double balance;

    public void changeBalance(AccountAction action, double amount)
            throws InsufficentBalanceException, NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException(amount);

        balance = action.act(balance, amount);
        System.out.println(action + " : " + amount + " for account id: " + id);
    }
}
