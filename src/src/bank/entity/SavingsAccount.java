package bank.entity;

import accountparty.account.AccountType;
import accountparty.InterestCalculationStrategy;


public class SavingsAccount extends AccountType {


    public SavingsAccount(InterestCalculationStrategy interestCalculationStrategy) {
        super(interestCalculationStrategy);
    }






}
