package accountparty.notification;


import accountparty.account.Account;
import accountparty.rule.RulesEngine;

import java.math.BigDecimal;

public class LoggerObserver implements Observer {

    private final RulesEngine rulesEngine;
    private static LoggerObserver INSTANCE;

    private LoggerObserver(RulesEngine rulesEngine) {
        this.rulesEngine = rulesEngine;
    }

    public static LoggerObserver getInstance(RulesEngine rulesEngine) {
        if (INSTANCE == null) {
            INSTANCE = new LoggerObserver(rulesEngine);
        }
        return INSTANCE;
    }

    @Override
    public void send(Account account, String message, BigDecimal amount) {
        System.out.println("Logging service... " + account.getAccountNumber() + " " + message + " " + amount) ;
    }
}
