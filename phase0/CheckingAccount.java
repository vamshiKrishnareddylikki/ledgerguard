public class CheckingAccount extends Account{
    private final double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double overdraftLimit){
        super(accountNumber, ownerName);
        this.overdraftLimit = overdraftLimit;

    }

    @Override
    protected double availableFunds() {
        return getBalance() + overdraftLimit;
    }
}
