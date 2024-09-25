package creditcard.strategy.interestStrategy;

import accountparty.account.Account;
import accountparty.InterestCalculationStrategy;

import java.math.BigDecimal;

public class SilverCreditCardInterestCalculationStrategy implements InterestCalculationStrategy {
    private static SilverCreditCardInterestCalculationStrategy silverCreditCardInterestCalculationStrategy;
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.08);
    private SilverCreditCardInterestCalculationStrategy() {}
    public static SilverCreditCardInterestCalculationStrategy getInstance() {
        if (silverCreditCardInterestCalculationStrategy == null) {
            silverCreditCardInterestCalculationStrategy = new SilverCreditCardInterestCalculationStrategy();
        }
        return silverCreditCardInterestCalculationStrategy;
    }
    @Override
    public BigDecimal calculateInterest(Account account) {
        return account.getBalance().multiply(INTEREST_RATE);
    }
    public BigDecimal getRate() {
        return INTEREST_RATE;
    }
}