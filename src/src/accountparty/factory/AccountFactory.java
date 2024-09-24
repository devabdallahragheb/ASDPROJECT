package accountparty.factory;

import accountparty.account.Account;
import accountparty.customer.Customer;

public interface AccountFactory {

    Account createNewAccountForCustomer(Customer customer, AccountTypeFactory accountTypeFactory);
}
