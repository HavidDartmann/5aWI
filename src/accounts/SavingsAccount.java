package accounts;

public class SavingsAccount extends BaseAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate);
    }
}
