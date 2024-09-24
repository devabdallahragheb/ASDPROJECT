package bank.factory;

import accountparty.account.Account;
import accountparty.factory.AccountFactory;
import accountparty.factory.AccountTypeFactory;
import bank.entity.BankingAccount;
import accountparty.customer.Customer;

public class BankAccountFactory implements AccountFactory {

    @Override
    public Account createNewAccountForCustomer(Customer customer, AccountTypeFactory accountTypeFactory) {
        return new BankingAccount(customer, accountTypeFactory.provide());
    }
}
