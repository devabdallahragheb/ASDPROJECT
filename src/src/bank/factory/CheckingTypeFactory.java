package bank.factory;

import accountparty.account.AccountType;
import accountparty.factory.AccountTypeFactory;
import bank.InteresetStrategy.CheckingAccountStrategy;
import bank.entity.CheckingAccount;

public class CheckingTypeFactory implements AccountTypeFactory {

    @Override
    public AccountType provide() {
        return new CheckingAccount(CheckingAccountStrategy.getInstance());
    }
}
