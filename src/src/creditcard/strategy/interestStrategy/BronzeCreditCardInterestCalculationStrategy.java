package creditcard.strategy.interestStrategy;


import accountparty.account.Account;
import accountparty.InterestCalculationStrategy;

import java.math.BigDecimal;

public class BronzeCreditCardInterestCalculationStrategy implements InterestCalculationStrategy {
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.1);
    @Override
    public BigDecimal calculateInterest(Account account) {
        return account.getBalance().multiply(INTEREST_RATE);
    }

    public BigDecimal getRate() {
        return INTEREST_RATE;
    }
}
