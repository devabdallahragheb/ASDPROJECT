package creditcard.factory;


import creditcard.entity.BronzeCreditCard;
import creditcard.entity.CreditCardAccountType;

public class BronzeCreditCardTypeFactory implements CreditCardAccountTypeFactory {

    @Override
    public CreditCardAccountType provide() {
        return new BronzeCreditCard();
    }
}
