package accountparty.rule;


import accountparty.account.Account;

import java.math.BigDecimal;

public interface EmailRule {
	void apply(Account account, String message, BigDecimal amount);
}
