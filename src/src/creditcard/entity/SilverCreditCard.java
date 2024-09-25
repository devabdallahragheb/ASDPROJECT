package creditcard.entity;


import creditcard.strategy.interestStrategy.SilverCreditCardInterestCalculationStrategy;
import creditcard.strategy.minimumPaymentStrategy.SilverMinimumPaymentStrategy;

public class SilverCreditCard extends CreditCardAccountType {


    public SilverCreditCard() {
        super(SilverCreditCardInterestCalculationStrategy.getInstance(), SilverMinimumPaymentStrategy.getInstance());
    }



    @Override
    protected long getCardValidityInYears() {
        return 3;
    }
}