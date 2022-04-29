package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.service;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.Customer;

public interface LoginServiceI {

    void login(String tckn, String password) throws NoSuchCustomerException, CustomerAlreadyLoggedException, WrongCustomerCredentialsException,
            MaxNumberOfFailedLoggingAttemptExceededException, CustomerLockedException, ValidationException;

    boolean logout(Customer customer);

}
