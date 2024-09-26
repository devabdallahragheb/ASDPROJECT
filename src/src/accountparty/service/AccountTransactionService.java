package accountparty.service;


import accountparty.notification.Observer;
import accountparty.notification.TransactionObservable;

import java.math.BigDecimal;

public interface AccountTransactionService {
    void deposit(String accountNumber, BigDecimal amount);
    void withdraw(String accountNumber, BigDecimal amount);
    String generateReport();
    void addTransactionObserver(Observer observer);
}
