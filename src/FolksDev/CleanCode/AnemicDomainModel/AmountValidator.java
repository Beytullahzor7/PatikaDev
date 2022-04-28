package FolksDev.CleanCode.AnemicDomainModel;

import FolksDev.CleanCode.Atm.Exceptions.NegativeAmountException;

public class AmountValidator {

    public void validate(double amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException(amount);
    }
}
