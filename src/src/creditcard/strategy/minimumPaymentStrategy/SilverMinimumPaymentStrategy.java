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
    @Override
    public BigDecimal minimumPayment(Account account) {
        BigDecimal mp = new BigDecimal("0.12");
        return account.getBalance().add(account.getBalance().multiply(mp));
    }
    public BigDecimal getRate() {
        return RATE;
    }
}
