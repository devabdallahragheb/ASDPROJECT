package creditcard.strategy.minimumPaymentStrategy;


import accountparty.account.Account;

import java.math.BigDecimal;

public class BronzeMinimumPaymentStrategy implements MinimumPaymentStrategy{
    private static BronzeMinimumPaymentStrategy bronzeMinimumPaymentStrategy;
    private static final BigDecimal RATE = BigDecimal.valueOf(0.14);
    private BronzeMinimumPaymentStrategy() {}
    public static BronzeMinimumPaymentStrategy getInstance() {
        if(bronzeMinimumPaymentStrategy==null){
            bronzeMinimumPaymentStrategy = new BronzeMinimumPaymentStrategy();
        }
        return bronzeMinimumPaymentStrategy;
    }
    @Override
    public BigDecimal minimumPayment(Account account) {
        BigDecimal mp = new BigDecimal("0.14");
        return account.getBalance().add(account.getBalance().multiply(mp));
    }
    public BigDecimal getRate() {
        return RATE;
    }
}
