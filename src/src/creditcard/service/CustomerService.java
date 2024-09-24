package creditcard.service;


import accountparty.customer.Customer;

public interface CustomerService {

    public Customer createCustomer(String name, String email, String street, String city, String state, String zip);
}
