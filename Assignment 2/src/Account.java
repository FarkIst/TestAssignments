public class Account {
    public int balance;

    public Account(int balance) throws Exception {
        if(balance < 0 )
            throw new Exception("Negative balance not allower");
        this.balance = balance;
    }
}
