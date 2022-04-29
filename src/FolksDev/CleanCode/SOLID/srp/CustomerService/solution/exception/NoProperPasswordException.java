package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class NoProperPasswordException extends ValidationException {

    public NoProperPasswordException(String message) {
        super(message);
    }
}
