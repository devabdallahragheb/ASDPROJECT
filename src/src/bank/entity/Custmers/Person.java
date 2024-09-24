package bank.entity.Custmers;


import accountparty.customer.Customer;

import java.time.LocalDate;

public class Person extends Customer {

    private final LocalDate birthDate;

    public Person(String name, String email, String Street, String City, String State, String Zip, LocalDate dateOfBirth) {
        super(name, email, Street, City, State, Zip);
        this.birthDate=dateOfBirth;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getType() {
        return "PERSONAL";
    }
}
