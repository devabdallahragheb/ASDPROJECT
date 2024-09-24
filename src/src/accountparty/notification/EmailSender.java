package accountparty.notification;


import accountparty.account.Account;
import accountparty.rule.RulesEngine;

import java.math.BigDecimal;

public class EmailSender implements Observer {

    private final RulesEngine rulesEngine;
    private static EmailSender INSTANCE;

    private EmailSender(RulesEngine rulesEngine) {
        this.rulesEngine = rulesEngine;
    }

    public static EmailSender getInstance(RulesEngine rulesEngine) {
        if (INSTANCE == null) {
            INSTANCE = new EmailSender(rulesEngine);
        }
        return INSTANCE;
    }

    @Override
    public void send(Account account, String message, BigDecimal amount) {
        rulesEngine.applyRules(account, message, amount);
    }
}
