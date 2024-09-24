package bank.entity;

import accountparty.account.Account;
import accountparty.account.AccountType;
import accountparty.customer.Customer;
import accountparty.helper.RandomGenerator;

public class BankingAccount extends Account {

    public BankingAccount(Customer accountOwner, AccountType accountType) {
        super(RandomGenerator.generateAccountNumber(), accountOwner, accountType);
    }

}
