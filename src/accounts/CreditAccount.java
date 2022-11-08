package accounts;

public class CreditAccount extends BaseAccount{
    private double limit;

    public CreditAccount(double balance, double limit) {
        super(balance);
        this.limit = -limit;
    }

    public void withdraw(double amount){
        if ((getBalance() - amount) < limit) {
            System.out.println("You have reached your limit");
        } else {
            super.withdraw(amount);
        }
    }
}

