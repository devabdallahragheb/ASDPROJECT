package accountparty.notification;


import accountparty.account.Account;

import java.math.BigDecimal;

public interface Observer {
    void send(Account account, String message, BigDecimal amount);
}
