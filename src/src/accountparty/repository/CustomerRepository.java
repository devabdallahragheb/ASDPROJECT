package accountparty.repository;


import accountparty.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {


    private static final List<Customer> CUSTOMER_DB = new ArrayList<>();
    public CustomerRepository() {

    }


    public void save(Customer customer) {
        CUSTOMER_DB.add(customer);
    }

}
