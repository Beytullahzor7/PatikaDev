package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.service;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.Account;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.Customer;

public interface CustomerServiceI {


    boolean lockCustomer(Customer customer);

    boolean changePassword(Customer customer, String newpassword) throws ValidationException;

    void createCustomer(Customer customer);

    Account getDefaultAccount(Customer customer);

    Customer getCurrentCustomer();

    Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;

    void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException;

    void checkIfCustomerLocked(Customer customer) throws CustomerLockedException;
}
