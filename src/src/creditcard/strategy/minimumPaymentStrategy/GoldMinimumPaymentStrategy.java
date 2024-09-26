package creditcard.strategy.minimumPaymentStrategy;


import accountparty.account.Account;

import java.math.BigDecimal;

public class GoldMinimumPaymentStrategy implements MinimumPaymentStrategy {
    private static final BigDecimal RATE = BigDecimal.valueOf(0.1);
    private static GoldMinimumPaymentStrategy goldMinimumPaymentStrategy;

    private GoldMinimumPaymentStrategy() {
    }

    public static MinimumPaymentStrategy getInstance() {
        if (goldMinimumPaymentStrategy == null)
            goldMinimumPaymentStrategy = new GoldMinimumPaymentStrategy();
        return goldMinimumPaymentStrategy;
    }
    public BigDecimal getRate() {
        return RATE;
    }
}
