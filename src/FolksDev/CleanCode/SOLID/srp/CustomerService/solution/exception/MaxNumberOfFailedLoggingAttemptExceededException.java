package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception;

public class MaxNumberOfFailedLoggingAttemptExceededException extends Exception {

    public MaxNumberOfFailedLoggingAttemptExceededException(String message) {
        super(message);
    }
}
