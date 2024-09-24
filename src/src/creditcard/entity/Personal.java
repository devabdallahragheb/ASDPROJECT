package creditcard.entity;


import accountparty.customer.Customer;

import java.time.LocalDate;

public class Personal extends Customer {

    private final LocalDate birthDate;

    public Personal(String name, String email, String street, String city, String state, String zip, LocalDate birthDate) {
        super(name, email, street, city, state, zip);
        this.birthDate = birthDate;
    }

    public String getType() {
        return "PERSONAL";
    }
}
