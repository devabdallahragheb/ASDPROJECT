package creditcard.entity;

import creditcard.strategy.interestStrategy.GoldCreditCardInterestCalculationStrategy;
import creditcard.strategy.minimumPaymentStrategy.GoldMinimumPaymentStrategy;

public class GoldCreditCard extends CreditCardAccountType {


    public GoldCreditCard() {
        super(GoldCreditCardInterestCalculationStrategy.getInstance(), GoldMinimumPaymentStrategy.getInstance());
    }


    @Override
    protected long getCardValidityInYears() {
        return 4;
    }
}
