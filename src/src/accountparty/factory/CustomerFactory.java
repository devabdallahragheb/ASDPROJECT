package accountparty.factory;

import accountparty.customer.Customer;

public interface CustomerFactory {

    Customer createCustomer(String name, String email, String street, String city, String state, String zip);

}
