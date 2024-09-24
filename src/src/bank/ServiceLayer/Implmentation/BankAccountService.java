package bank.ServiceLayer.Implmentation;


import accountparty.account.Account;
import accountparty.repository.AccountRepository;
import bank.factory.BankAccountFactory;
import bank.factory.CheckingTypeFactory;
import bank.factory.SavingTypeFactory;
import bank.rule.CompanyAccountEmailRule;
import bank.rule.PersonalAccountEmailRule;
import accountparty.customer.Customer;
import accountparty.factory.AccountTypeFactory;
import accountparty.notification.EmailSender;
import accountparty.rule.RulesEngine;
import accountparty.service.AccountService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class BankAccountService extends AccountService {


    public BankAccountService(AccountRepository accountRepository) {
        super(accountRepository);
        RulesEngine rulesEngine = new RulesEngine();

        // Adding rules
        rulesEngine.addRule(new CompanyAccountEmailRule());
        rulesEngine.addRule(new PersonalAccountEmailRule());
        addTransactionObserver(EmailSender.getInstance(rulesEngine));
    }

    public Account createAccount(Customer customer, String accountType) {

        AccountTypeFactory accountTypeFactory;
        if(accountType.equalsIgnoreCase("Ch")) {
            accountTypeFactory = new CheckingTypeFactory();
        }else{
            accountTypeFactory = new SavingTypeFactory();
        }

        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        Account account= bankAccountFactory.createNewAccountForCustomer(customer,accountTypeFactory);

        this.getAccountRepository().save(account);
        return account;

    }

    public String getAccountNumber(Account account) {
        return account.getAccountNumber();
    }

    public List<Account> getAllAccounts() {
        return this.getAccountRepository().getAllAccounts();
    }

    public BigDecimal getBalance(Account account) {
        return account.getBalance();
    }

    public Account getAccount(String accountNumber) {
        return this.getAccountRepository().findByAccountNumber(accountNumber);
    }


    @Override
    public String generateReport() {
        List<Account> accounts = getAccountRepository().getAllAccounts();
        StringBuilder report = new StringBuilder("Banking Accounts Report:\n");
        for (Account account : accounts) {
            report.append(account.generateAccountReport(LocalDate.MIN, LocalDate.MAX)).append("\n");
        }
        return report.toString();
    }
}
