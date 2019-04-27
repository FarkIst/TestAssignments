import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    @Test
    void calculateYearlyInterest() throws Exception {
        boolean randBool = getRandomBoolean();
        Bank bank = new Bank();
        Account account1 = new Account(0);
        Account account2 = new Account(50);
        Account account3 = new Account(100);
        Account account4 = new Account(150);
        Account account5 = new Account(900);
        Account account6 = new Account(1000);
        Account account7 = new Account(1001);
        Account account8 = new Account(10000);

        assertTrue(randBool);
        assertEquals(bank.calculateYearlyInterest(account1), 0);
        assertEquals(bank.calculateYearlyInterest(account2), 50 * 3/100);
        assertEquals(bank.calculateYearlyInterest(account3), 100 * 3/100);
        assertEquals(bank.calculateYearlyInterest(account4), 150 * 5/100);
        assertEquals(bank.calculateYearlyInterest(account5), 900 * 5/100);
        assertEquals(bank.calculateYearlyInterest(account6), 1000 * 5/100);
        assertEquals(bank.calculateYearlyInterest(account7), 1001 * 7/100);
        assertEquals(bank.calculateYearlyInterest(account8), 10000 * 7/100);
    }
}