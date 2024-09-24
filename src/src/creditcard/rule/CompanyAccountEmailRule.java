package creditcard.rule;


import accountparty.account.Account;
import accountparty.rule.EmailRule;

import java.math.BigDecimal;

public class CompanyAccountEmailRule implements EmailRule {
    @Override
    public void apply(Account account, String message, BigDecimal amount) {
        if (account.getAccountOwner() != null) {//todo: check CompanyAccount
            sendEmail(account, message, amount);
        }
    }

    private void sendEmail(Account account, String message, BigDecimal amount) {
        System.out.println(
                String.format("Sending email: accountparty.account %s - %s ", account.getAccountNumber(), message) + amount + "$");
    }
}
