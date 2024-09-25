package creditcard.strategy.interestStrategy;

import accountparty.account.Account;
import accountparty.InterestCalculationStrategy;

import java.math.BigDecimal;

public class GoldCreditCardInterestCalculationStrategy implements InterestCalculationStrategy {
    private static GoldCreditCardInterestCalculationStrategy goldCreditCardInterestCalculationStrategy;
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.06);
    private GoldCreditCardInterestCalculationStrategy() {}
    public static GoldCreditCardInterestCalculationStrategy getInstance() {
        if (goldCreditCardInterestCalculationStrategy == null) {
            goldCreditCardInterestCalculationStrategy = new GoldCreditCardInterestCalculationStrategy();
        }
        return goldCreditCardInterestCalculationStrategy;
    }
    @Override
    public BigDecimal calculateInterest(Account account) {
        return account.getBalance().multiply(INTEREST_RATE);
    }

    public BigDecimal getRate() {
        return INTEREST_RATE;
    }
}
