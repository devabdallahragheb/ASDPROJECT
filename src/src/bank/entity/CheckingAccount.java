package bank.entity;

import accountparty.account.AccountType;
import accountparty.InterestCalculationStrategy;


public class CheckingAccount extends AccountType {


    public CheckingAccount(InterestCalculationStrategy interestCalculationStrategy) {
        super(interestCalculationStrategy);
    }

}
