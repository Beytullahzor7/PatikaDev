package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class WrongCustomerCredentialsException extends Exception {

    public WrongCustomerCredentialsException(String message) {
        super(message);
    }
}
