package bank.ServiceLayer;

import accountparty.customer.Customer;

import java.time.LocalDate;

public interface CustmerService {

    Customer CreateCustmer(String name, String email, String Street, String City, String State, String Zip, int NumberOfEmployee);
    Customer CreateCustmer(String name, String email, String Street, String City, String State, String Zip, LocalDate dateOfBirth);

}
