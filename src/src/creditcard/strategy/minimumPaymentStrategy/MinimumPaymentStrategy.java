package creditcard.strategy.minimumPaymentStrategy;


import accountparty.account.Account;

import java.math.BigDecimal;

public interface MinimumPaymentStrategy {
    BigDecimal minimumPayment(Account account);
    BigDecimal getRate();
}
