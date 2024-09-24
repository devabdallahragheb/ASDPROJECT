package creditcard.factory;


import creditcard.entity.CreditCardAccountType;
import accountparty.factory.AccountTypeFactory;

public interface CreditCardAccountTypeFactory extends AccountTypeFactory {

    CreditCardAccountType provide();
}
