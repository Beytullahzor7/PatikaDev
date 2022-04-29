package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.dao;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.*;
import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.model.Customer;

public interface CustomerDAOI {

    boolean createCustomer(Customer customer) throws CustomerAlreadyExistsException;

    Customer retrieveCustomer(String tckn) throws NoSuchCustomerException;

    boolean updateCustomer(Customer customer) throws NoSuchCustomerException;

    boolean deleteCustomer(Customer customer) throws NoSuchCustomerException;

    Customer refreshCustomer(Customer customer) throws NoSuchCustomerException;
}