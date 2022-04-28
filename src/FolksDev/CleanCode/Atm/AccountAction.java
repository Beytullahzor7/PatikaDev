package FolksDev.CleanCode.Atm;

import FolksDev.CleanCode.Atm.Exceptions.InsufficentBalanceException;

public interface AccountAction {

    double act(double balance, double amount) throws InsufficentBalanceException;

}
