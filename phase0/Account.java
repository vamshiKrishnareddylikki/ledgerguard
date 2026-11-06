public abstract class Account {
    private final String accountNumber;
    private String ownerName;
    private double balance;
    private static int totalAccountsOpened;

    Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        totalAccountsOpened++;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccountsOpened() {
        return totalAccountsOpened;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Rejected: deposit must be positive, got " + amount);
            return;
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Rejected: withdraw must be positive, got " + amount);
            return;
        } else if (amount > availableFunds()) {
            System.out.println("Rejected: insufficient balance. Requested " + amount + ", available " + availableFunds());
            return;

        }
        balance -= amount;
    }

    protected double availableFunds() {
        return balance;
    }

}
