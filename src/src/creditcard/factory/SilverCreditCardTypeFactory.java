package creditcard.factory;


import creditcard.entity.CreditCardAccountType;
import creditcard.entity.SilverCreditCard;

public class SilverCreditCardTypeFactory implements CreditCardAccountTypeFactory {

    @Override
    public CreditCardAccountType provide() {
        return new SilverCreditCard();
    }
}
