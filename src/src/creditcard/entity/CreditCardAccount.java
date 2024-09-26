package creditcard.entity;


import accountparty.account.Account;
import accountparty.customer.Customer;
import accountparty.helper.RandomGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditCardAccount extends Account {


    private final String ccNumber;
    private final String cvv;
    private final LocalDate expiryDate;


    public CreditCardAccount(Customer accountOwner, CreditCardAccountType accountType) {
        super(RandomGenerator.generateAccountNumber(), accountOwner, accountType);
        this.ccNumber = RandomGenerator.generateCCNumber();
        this.cvv = RandomGenerator.generateCVV();
        this.expiryDate = accountType.generateExpiryDate();
    }




    public String getCcNumber() {
        return ccNumber;
    }



    public String getCvv() {
        return cvv;
    }



    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
