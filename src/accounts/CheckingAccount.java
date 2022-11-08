package accounts;

public class CheckingAccount extends BaseAccount{
    private double limit;

    public CheckingAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(double amount){
        if (amount > limit) {
            System.out.println("You have reached your limit");
        } else {
            super.withdraw(amount);
        }
    }
}
