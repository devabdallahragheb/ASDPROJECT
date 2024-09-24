package bank;



import accountparty.account.Account;
import bank.ServiceLayer.Implmentation.BankAccountService;
import bank.entity.BankingAccount;
import bank.entity.Custmers.Company;
import bank.rule.CompanyAccountEmailRule;
import bank.rule.PersonalAccountEmailRule;
import accountparty.customer.Customer;
import accountparty.notification.EmailSender;
import accountparty.repository.AccountRepository;
import accountparty.rule.RulesEngine;
import accountparty.service.AccountTransactionService;

import java.math.BigDecimal;
public class Test {
    public static void main(String[] args) {
        AccountRepository accountRepository = new AccountRepository();
        RulesEngine rulesEngine = new RulesEngine();

        // Adding rules
        rulesEngine.addRule(new CompanyAccountEmailRule());
        rulesEngine.addRule(new PersonalAccountEmailRule());

        AccountTransactionService accountService = new BankAccountService(accountRepository);
        accountService.addTransactionObserver(EmailSender.getInstance(rulesEngine));

        // Create accounts and customers
        Customer johnDoe = new Company("John Doe", "john.doe@example.com", "1000 Main", "Fairfield", "IA", "52556", 10);

        Account johnsAccount = new BankingAccount(johnDoe, null);

        johnDoe.addAccount(johnsAccount);
        accountRepository.save(johnsAccount);

        // Perform transactions
        accountService.deposit("12345", BigDecimal.valueOf(1600));
        accountService.withdraw("12345", BigDecimal.valueOf(700));

//        AccountService accountparty.account.service = new BankAccountServiceImpl(accountRepository);
//        System.out.println(accountparty.account.service.generateReport());
    }
}
