package accounts;

public class Main {
    public static void main(String[] args) {
        // You exceed your withdrawal limit
        CheckingAccount Checking = new CheckingAccount(1000, 100);
        Checking.withdraw(101);
        System.out.println(Checking.getBalance());

        SavingsAccount Savings = new SavingsAccount(1000, 0.1);
        Savings.addInterest();
        Savings.addInterest();
        System.out.println(Savings.getBalance());

        //You can only withdraw money till you reach your limit
        CreditAccount Credit = new CreditAccount(1000, 100);
        Credit.withdraw(1101);
        System.out.println(Credit.getBalance());
    }
}
