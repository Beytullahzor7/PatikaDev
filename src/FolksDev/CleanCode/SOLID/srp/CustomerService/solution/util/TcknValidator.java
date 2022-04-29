package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;

public class TcknValidator implements Validator {

    /**
     * This method validates tckn of the customer.
     *
     * @param tckn Tckn of the customer.
     * @throws ImproperCustomerCredentialsException Throws when the rules regarding the tckn are broken.
     */
    @Override
    public void validate(String tckn) throws ImproperCustomerCredentialsException {
        if (tckn == null | tckn.length() == 0)
            throw new ImproperCustomerCredentialsException("Empty TCKN not allowed.");

        String length = ATMProperties.getProperty("customer.tckn.length");
        int tcknLength = Integer.parseInt(length);
        if (tckn.length() < tcknLength)
            throw new ImproperCustomerCredentialsException("TCKN must have " + tcknLength + " characters.");
    }
}
