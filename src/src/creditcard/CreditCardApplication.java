package creditcard;




import accountparty.account.Account;
import creditcard.entity.CCCustomer;
import creditcard.factory.CreditCardAccountFactory;
import creditcard.factory.GoldCreditCardTypeFactory;
import creditcard.factory.SilverCreditCardTypeFactory;
import accountparty.customer.Customer;
import accountparty.factory.AccountTypeFactory;

import java.math.BigDecimal;

public class CreditCardApplication {
    public static void main(String[] args) {
        Customer company1 = new CCCustomer("Company 1", "info@company1.com", "1000 N, 4th street", "Fairfield", "IA", "52557");

        AccountTypeFactory goldCreditCard = new GoldCreditCardTypeFactory();
        AccountTypeFactory silverCreditCard = new SilverCreditCardTypeFactory();

        Account company1GoldCC = new CreditCardAccountFactory().createNewAccountForCustomer(company1, goldCreditCard);
        Account company1SilverCC = new CreditCardAccountFactory().createNewAccountForCustomer(company1, silverCreditCard);
        Account company2GoldCC = new CreditCardAccountFactory().createNewAccountForCustomer(company1, goldCreditCard);

        company1GoldCC.deposit(BigDecimal.valueOf(1000));
        company1GoldCC.addInterest();

        company2GoldCC.deposit(BigDecimal.valueOf(2000));
        company2GoldCC.addInterest();

        BigDecimal balanceCompany1GoldCC = company1GoldCC.getBalance();
        BigDecimal balanceCompany1SilverCC = company1SilverCC.getBalance();
        BigDecimal balanceCompany2GoldCC = company2GoldCC.getBalance();
        System.out.println("balance Company1 GoldCC: " + balanceCompany1GoldCC);
        System.out.println("balance Company1 SilverCC: " + balanceCompany1SilverCC);
        System.out.println("balance Company2 GoldCC: " + balanceCompany2GoldCC);
    }
}
