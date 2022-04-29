package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class ImproperCustomerCredentialsException extends ValidationException {
    private static final String prefix = "Improper customer credentials are provided: ";

    public ImproperCustomerCredentialsException(String message) {
        super(message);
    }

    public String getMessage() {
        return prefix + super.getMessage();
    }
}