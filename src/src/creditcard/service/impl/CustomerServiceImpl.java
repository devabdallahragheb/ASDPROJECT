package creditcard.service.impl;


import creditcard.entity.CCCustomer;
import creditcard.service.CustomerService;
import accountparty.customer.Customer;
import accountparty.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;
    public CustomerServiceImpl() {
        this.customerRepository = new CustomerRepository();
    }
    @Override
    public Customer createCustomer(String name, String email, String street, String city, String state, String zip) {
        Customer customer = new CCCustomer(name, email, street, city, state, zip);
        customerRepository.save(customer);
        return customer;
    }


}
