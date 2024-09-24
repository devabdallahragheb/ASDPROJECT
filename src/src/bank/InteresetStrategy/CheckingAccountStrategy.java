package bank.InteresetStrategy;

import accountparty.account.Account;
import accountparty.InterestCalculationStrategy;

import java.math.BigDecimal;

public class CheckingAccountStrategy implements InterestCalculationStrategy {
    private static CheckingAccountStrategy checkingStrategy;
    private static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(0.02);

    private CheckingAccountStrategy(){

    }

    @Override
    public BigDecimal calculateInterest(Account account) {
           return account.getBalance().multiply(INTEREST_RATE);
    }

    public static CheckingAccountStrategy getInstance(){
        if(checkingStrategy == null){
            checkingStrategy = new CheckingAccountStrategy();
        }
        return checkingStrategy;

    }

    public BigDecimal getRate() {
        return INTEREST_RATE;
    }
}


