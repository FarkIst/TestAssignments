
public class Main {

    public static void main(String[] args) throws Exception {
        Account account = new Account(150);
        Bank bank = new Bank();


        System.out.println(bank.calculateYearlyInterest(account));
    }
}
