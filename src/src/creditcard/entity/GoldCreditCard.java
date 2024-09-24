package creditcard.entity;

import creditcard.strategy.interestStrategy.GoldCreditCardInterestCalculationStrategy;
import creditcard.strategy.minimumPaymentStrategy.GoldMinimumPaymentStrategy;

public class GoldCreditCard extends CreditCardAccountType {


    public GoldCreditCard() {
        super(new GoldCreditCardInterestCalculationStrategy(), new GoldMinimumPaymentStrategy());
    }



    @Override
    protected long getCardValidityInYears() {
        return 4;
    }
}
