package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class CustomerAlreadyExistsException extends Exception {

    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
}
