package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.exception.ValidationException;

public interface Validator {

    void validate(String string) throws ValidationException;

}