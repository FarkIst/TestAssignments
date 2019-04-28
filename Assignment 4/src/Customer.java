import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Customer {
    public Account account;
    public CreditCard card;
    public Calendar created;
    public boolean loyaltyCard = false;
    public boolean coupon = false;

    public Customer(Account account, Calendar created) {
        this.account = account;
        this.created = created;
    }

    public boolean isNewCustomer() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        if(sdf.format(this.created.getTime()).equals(sdf.format(Calendar.getInstance().getTime()))) {
            return true;
        }
        return false;
    }

    public void createCreditCard() {
        this.card = new CreditCard(this.account, this);
    }
}
