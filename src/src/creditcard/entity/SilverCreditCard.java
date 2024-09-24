package creditcard.entity;


import creditcard.strategy.interestStrategy.SilverCreditCardInterestCalculationStrategy;
import creditcard.strategy.minimumPaymentStrategy.SilverMinimumPaymentStrategy;

public class SilverCreditCard extends CreditCardAccountType {


    public SilverCreditCard() {
        super(new SilverCreditCardInterestCalculationStrategy(), new SilverMinimumPaymentStrategy());
    }



    @Override
    protected long getCardValidityInYears() {
        return 3;
    }
}
