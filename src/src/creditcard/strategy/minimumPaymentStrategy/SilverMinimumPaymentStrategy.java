package creditcard.strategy.minimumPaymentStrategy;


import accountparty.account.Account;

import java.math.BigDecimal;

public class SilverMinimumPaymentStrategy implements MinimumPaymentStrategy{
    private static final BigDecimal RATE = BigDecimal.valueOf(0.1);
    private static SilverMinimumPaymentStrategy silverMinimumPaymentStrategy;
    private SilverMinimumPaymentStrategy(){}
    public static SilverMinimumPaymentStrategy getInstance(){
        if(silverMinimumPaymentStrategy == null){
            silverMinimumPaymentStrategy = new SilverMinimumPaymentStrategy();
        }
        return silverMinimumPaymentStrategy;
    }
    public BigDecimal getRate() {
        return RATE;
    }
}
