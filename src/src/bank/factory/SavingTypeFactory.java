package bank.factory;

import accountparty.account.AccountType;
import accountparty.factory.AccountTypeFactory;
import bank.InteresetStrategy.SavingInterestStrategy;
import bank.entity.SavingsAccount;

public class SavingTypeFactory implements AccountTypeFactory {

    @Override
    public AccountType provide() {
        return new SavingsAccount(SavingInterestStrategy.getInstance());
    }
}
