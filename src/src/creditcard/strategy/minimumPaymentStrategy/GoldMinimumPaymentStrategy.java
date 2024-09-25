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

    @Override
    public BigDecimal minimumPayment(Account account) {
        BigDecimal mp = new BigDecimal("0.1");
        return account.getBalance().add(account.getBalance().multiply(mp));
    }

    public BigDecimal getRate() {
        return RATE;
    }
}
