package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class CustomerAlreadyLoggedException extends Exception {

    public CustomerAlreadyLoggedException(String message) {
        super(message);
    }
}
