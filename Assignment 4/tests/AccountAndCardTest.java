import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class AccountAndCardTest {
    @Test
    void testGetMonthlyInterest() throws Exception {
        Account account1 = new Account(0);
        Account account2 = new Account(50);
        Account account3 = new Account(100);
        Account account4 = new Account(150);
        Account account5 = new Account(900);
        Account account6 = new Account(1000);
        Account account7 = new Account(1001);
        Account account8 = new Account(10000);

        assertEquals(account1.getMonthlyInterest(), 0);
        assertEquals(account2.getMonthlyInterest(), 50 * 3/100);
        assertEquals(account3.getMonthlyInterest(), 100 * 3/100);
        assertEquals(account4.getMonthlyInterest(), 150 * 5/100);
        assertEquals(account5.getMonthlyInterest(), 900 * 5/100);
        assertEquals(account6.getMonthlyInterest(), 1000 * 5/100);
        assertEquals(account7.getMonthlyInterest(), 1001 * 7/100);
        assertEquals(account8.getMonthlyInterest(), 10000 * 7/100);
    }

    @Test
    void testGetCardDiscount() throws Exception {
        Account account = new Account(150);
        Customer newCustomer = new Customer(account, new GregorianCalendar());
        newCustomer.createCreditCard();
        Customer oldCustomer = new Customer(account, new GregorianCalendar(2015,2,25));
        oldCustomer.createCreditCard();
        Customer oldCustomerWithCoupon = new Customer(account, new GregorianCalendar(2015,2,25));
        oldCustomerWithCoupon.coupon = true;
        oldCustomerWithCoupon.createCreditCard();
        Customer oldLoyalCustomer = new Customer(account, new GregorianCalendar(2015,2,25));
        oldLoyalCustomer.loyaltyCard = true;
        oldLoyalCustomer.createCreditCard();
        Customer oldLoyalCustomerWithCoupon = new Customer(account, new GregorianCalendar(2015,2,25));
        oldLoyalCustomerWithCoupon.loyaltyCard = true;
        oldLoyalCustomerWithCoupon.coupon = true;
        oldLoyalCustomerWithCoupon.createCreditCard();

        assertEquals(newCustomer.card.getDiscount(), 15);
        assertEquals(oldCustomer.card.getDiscount(), 0);
        assertEquals(oldCustomerWithCoupon.card.getDiscount(), 20);
        assertEquals(oldLoyalCustomer.card.getDiscount(), 10);
        assertEquals(oldLoyalCustomerWithCoupon.card.getDiscount(), 30);
    }
}