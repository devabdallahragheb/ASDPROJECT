package creditcard.strategy.interestStrategy;

import accountparty.account.Account;
import accountparty.InterestCalculationStrategy;

import java.math.BigDecimal;

public class GoldCreditCardInterestCalculationStrategy implements InterestCalculationStrategy {
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.06);
    @Override
    public BigDecimal calculateInterest(Account account) {
        BigDecimal rate = new BigDecimal("0.06");
        return account.getBalance().multiply(rate);
    }

    public BigDecimal getRate() {
        return INTEREST_RATE;
    }
}
