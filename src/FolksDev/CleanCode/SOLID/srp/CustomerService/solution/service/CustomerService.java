package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.service;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.dao.CustomerDAOI;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util.Validator;

import java.io.Serializable;

public class CustomerService extends AbstractService implements CustomerServiceI, Serializable {
    private CustomerDAOI customerDao;

    private Validator passwordValidator;

    // Logged in customer
    private Customer currentCustomer;

    public CustomerService() {
    }

    @Override
    public void checkIfCustomerAlreadyLoggedIn(Customer customer) throws CustomerAlreadyLoggedException {
        if (customer.isLoggedIn()) {
            throw new CustomerAlreadyLoggedException("Customer is already logged in. Please first log out.");
        }
    }

    @Override
    public void checkIfCustomerLocked(Customer customer) throws CustomerLockedException {
        if (customer.isLocked()) {
            throw new CustomerLockedException("Customer is locked. Please consult your admin.");
        }
    }

    @Override
    public boolean lockCustomer(Customer customer) {
        boolean lock = false;
        customer.setLocked(true);
        try {
            lock = customerDao.updateCustomer(customer);
        } catch (NoSuchCustomerException e) {
            logger.severe("Problem when locking the customer " + e.getMessage());
            e.printStackTrace();
        }
        return lock;
    }

    @Override
    public void createCustomer(Customer customer) {
        // TODO Auto-generated method stub

    }

    @Override
    public Account getDefaultAccount(Customer customer) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean changePassword(Customer customer, String password) throws ValidationException {
        boolean change = false;
        // First validate the password and then change it.
        passwordValidator.validate(password);
        customer.setPassword(password);
        try {
            change = customerDao.updateCustomer(customer);
        } catch (NoSuchCustomerException e) {
            logger.severe("Problem when updating the password of the customer " + e.getMessage());
            e.printStackTrace();
        }
        return change;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    @Override
    public Customer refreshCustomer(Customer customer) throws NoSuchCustomerException {
        return customerDao.refreshCustomer(customer);
    }
}