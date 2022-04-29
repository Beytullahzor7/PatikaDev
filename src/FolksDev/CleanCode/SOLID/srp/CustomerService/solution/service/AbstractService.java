package FolksDev.CleanCode.SOLID.srp.CustomerService.solution.service;

import FolksDev.CleanCode.SOLID.srp.CustomerService.solution.util.ATMLogger;

import java.util.logging.Logger;

public abstract class AbstractService {
    protected Logger logger;

    public AbstractService() {
        logger = ATMLogger.getLogger();
    }
}