package creditcard.entity;


import accountparty.customer.Customer;

public class CCCustomer extends Customer {

    public CCCustomer(String name, String email, String street, String city, String state, String zip) {
        super(name, email, street, city, state, zip);
    }

    public String getType() {
        return "CREDITCARD";
    }
}
