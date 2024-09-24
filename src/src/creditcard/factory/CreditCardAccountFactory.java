package creditcard.factory;

import creditcard.entity.CreditCardAccount;
import accountparty.customer.Customer;
import accountparty.factory.AccountFactory;
import accountparty.factory.AccountTypeFactory;

public class CreditCardAccountFactory implements AccountFactory {


    @Override
    public CreditCardAccount createNewAccountForCustomer(Customer customer, AccountTypeFactory accountTypeFactory) {
        if(accountTypeFactory instanceof CreditCardAccountTypeFactory factory){
            return new CreditCardAccount(customer, factory.provide());
        }
        throw new IllegalArgumentException("Invalid Account Type Factory");
    }


}
