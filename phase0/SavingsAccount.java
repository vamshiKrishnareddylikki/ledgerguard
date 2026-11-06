public class SavingsAccount extends Account {
    private final double annualInterestRate;

    public SavingsAccount(String accountNumber, String ownerName, double annualInterestRate) {
        super(accountNumber, ownerName);
        this.annualInterestRate = annualInterestRate;

    }

    public void addMonthlyInterest() {
        double interest = getBalance() * annualInterestRate / 12;
        if (interest <= 0) {
            return;
        }
        deposit(interest);
    }
}
