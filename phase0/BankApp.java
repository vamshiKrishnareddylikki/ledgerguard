import java.time.LocalDateTime;

public class BankApp {
    public static void main(String[] args) {
        Account priya = new SavingsAccount("ACC-1001", "Priya", 0.04);
        Account rahul = new CheckingAccount("ACC-1002", "Rahul", 100.0);


        priya.deposit(500.0);
        rahul.deposit(100.0);
        priya.withdraw(400);
        rahul.withdraw(120);
        System.out.println(priya.getOwnerName() + " has " + priya.getBalance());
        System.out.println(rahul.getOwnerName() + " has " + rahul.getBalance());
        System.out.println("Total accounts: " + Account.getTotalAccountsOpened());
        SavingsAccount anita = new SavingsAccount("ACC-2001", "Anita", 0.06);
        anita.deposit(1000.0);
        anita.addMonthlyInterest();
        System.out.println(anita.getOwnerName() + " has " + anita.getBalance());
        System.out.println("Total accounts: " + Account.getTotalAccountsOpened());
        CheckingAccount ravi = new CheckingAccount("ACC-3001", "Ravi", 200.0);
        ravi.deposit(100.0);
        ravi.withdraw(250.0);
        ravi.withdraw(100.0);
        System.out.println(ravi.getOwnerName() + " has " + ravi.getBalance());

        Transaction a = Transaction.create("ACC-1001", TransactionType.DEPOSIT, 500.0);
        Transaction b = Transaction.create("ACC-1001", TransactionType.DEPOSIT, 500.0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
    }
}
