package accountparty.account;

import accountparty.InterestCalculationStrategy;

public abstract class AccountType {

    private InterestCalculationStrategy interestCalculationStrategy;


    protected AccountType(InterestCalculationStrategy interestCalculationStrategy) {
        this.interestCalculationStrategy = interestCalculationStrategy;
    }


    public InterestCalculationStrategy getInterestCalculationStrategy() {
        return interestCalculationStrategy;
    }

}
