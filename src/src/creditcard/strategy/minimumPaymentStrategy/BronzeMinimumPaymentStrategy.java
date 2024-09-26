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
    public BigDecimal getRate() {
        return RATE;
    }
}
