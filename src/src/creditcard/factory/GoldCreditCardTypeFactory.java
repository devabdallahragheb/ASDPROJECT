package creditcard.factory;


import creditcard.entity.CreditCardAccountType;
import creditcard.entity.GoldCreditCard;

public class GoldCreditCardTypeFactory implements CreditCardAccountTypeFactory {

    @Override
    public CreditCardAccountType provide() {
        return new GoldCreditCard();
    }
}
