package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class CustomerLockedException extends Exception {

    public CustomerLockedException(String message) {
        super(message);
    }
}
