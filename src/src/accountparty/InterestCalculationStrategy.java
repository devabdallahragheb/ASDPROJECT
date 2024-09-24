package accountparty;
import accountparty.account.Account;

import java.math.BigDecimal;

public interface InterestCalculationStrategy {
    BigDecimal calculateInterest(Account account);
    BigDecimal getRate();
}
