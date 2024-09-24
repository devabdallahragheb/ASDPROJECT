package accountparty.notification;


import accountparty.account.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionObservable {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Account account, String message, BigDecimal amount) {
        for (Observer observer : observers) {
            observer.send(account, message, amount);
        }
    }
}
