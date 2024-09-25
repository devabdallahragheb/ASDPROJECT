package creditcard.entity;


import creditcard.strategy.interestStrategy.BronzeCreditCardInterestCalculationStrategy;
import creditcard.strategy.minimumPaymentStrategy.BronzeMinimumPaymentStrategy;


public class BronzeCreditCard extends CreditCardAccountType {


    public BronzeCreditCard() {
        super(BronzeCreditCardInterestCalculationStrategy.getInstance(),
                BronzeMinimumPaymentStrategy.getInstance());
    }


    @Override
    protected long getCardValidityInYears() {
        return 2;
    }
}
