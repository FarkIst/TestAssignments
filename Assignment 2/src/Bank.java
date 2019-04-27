public class Bank {
    public double calculateYearlyInterest(Account account) {
        if(account.balance > 0 && account.balance <= 100)
            return account.balance * 3/100;
        if(account.balance > 100 && account.balance <= 1000)
            return account.balance * 5/100;

        return account.balance * 7/100;
    }
}
