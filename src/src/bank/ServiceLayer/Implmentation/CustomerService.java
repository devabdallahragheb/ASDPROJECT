package bank.ServiceLayer.Implmentation;




import bank.ServiceLayer.CustmerService;
import bank.entity.Custmers.Company;
import bank.entity.Custmers.Person;
import accountparty.repository.CustomerRepository;

import java.time.LocalDate;

public class CustomerService implements CustmerService {

    CustomerRepository CustomerRepository;
    public CustomerService() {
        this.CustomerRepository = new CustomerRepository();
    }


    @Override
    public Company CreateCustmer(String name, String email, String Street, String City, String State, String Zip, int NumberOfEmployee) {
        Company company = new Company(name, email, Street, City, State, Zip, NumberOfEmployee);
        CustomerRepository.save(company);

        return company;
    }

    @Override
    public Person CreateCustmer(String name, String email, String Street, String City, String State, String Zip, LocalDate dateOfBirth) {
        Person person = new Person(name, email, Street, City, State, Zip, dateOfBirth);
        System.out.println(dateOfBirth+"test");
        CustomerRepository.save(person);
        return person;
    }
}
