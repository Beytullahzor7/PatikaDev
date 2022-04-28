package FolksDev.CleanCode.Atm.SpaghettiCodeAtm;

import FolksDev.CleanCode.Atm.Exceptions.InsufficentBalanceException;
import FolksDev.CleanCode.Atm.Exceptions.NegativeAmountException;

public class Account2 {

    private int id;
    private double balance;

    public void changeBalance(String action, double amount)
            throws InsufficentBalanceException, NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException(amount);

        if (action.equals("Deposit"))
            balance += amount;
        else if (action.equals("Withdraw")) {
            if (balance >= amount)
                balance -= amount;
            else
                throw new InsufficentBalanceException(action, balance, amount);
        }

        System.out.println(action + " : " + amount + " for account id: " + id);
    }
}
