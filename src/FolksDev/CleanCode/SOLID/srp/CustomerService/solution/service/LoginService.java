package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.service;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.dao.CustomerDAOI;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.Customer;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util.ATMProperties;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util.Validator;

import java.io.Serializable;

public class LoginService extends AbstractService implements LoginServiceI, Serializable {

    private CustomerServiceI customerService;
    private CustomerDAOI customerDao;
    private Validator passwordValidator;

    private int loginAttemptCount;

    @Override
    public void login(String tckn, String password) throws NoSuchCustomerException, CustomerLockedException, CustomerAlreadyLoggedException,
            WrongCustomerCredentialsException, MaxNumberOfFailedLoggingAttemptExceededException, ValidationException, NoSuchCustomerException {
        Customer customer = customerDao.retrieveCustomer(tckn);
        loginCustomer(customer, password);
    }

    private void loginCustomer(Customer customer, String password) throws CustomerAlreadyLoggedException, CustomerLockedException,
            MaxNumberOfFailedLoggingAttemptExceededException, NoSuchCustomerException, WrongCustomerCredentialsException, ValidationException {
        boolean login = false;
        customerService.checkIfCustomerAlreadyLoggedIn(customer);
        customerService.checkIfCustomerLocked(customer);
        passwordValidator.validate(password);
        checkCustomerPassword(customer, password);
        customerDao.updateCustomer(customer);
    }

    @Override
    public boolean logout(Customer customer) {
        boolean logout = false;

        customer.setLoggedIn(false);
        try {
            logout = customerDao.updateCustomer(customer);
            logout = true;
        } catch (NoSuchCustomerException e) {
            logger.severe("Problem when logging out the customer " + e.getMessage());
        }

        // It should point to null
        customer = null;
        return logout;
    }

    private void checkCustomerPassword(Customer customer, String password)
            throws MaxNumberOfFailedLoggingAttemptExceededException, WrongCustomerCredentialsException {
        if (!customer.getPassword().equals(password)) {
            loginAttemptCount++;
            checkLoginAttempCount(customer);
            throw new WrongCustomerCredentialsException("Wrong password!");
        }
    }

    private void checkLoginAttempCount(Customer customer) throws MaxNumberOfFailedLoggingAttemptExceededException {
        if (loginAttemptCount == Integer.parseInt(ATMProperties.getProperty("customer.maxFailedLoginAttempt"))) {
            lockCustomer(customer);
        }
    }

    private void lockCustomer(Customer customer) throws MaxNumberOfFailedLoggingAttemptExceededException {
        customer.setLocked(true);
        throw new MaxNumberOfFailedLoggingAttemptExceededException("Max number of login attempt reached: " + loginAttemptCount);
    }
}
