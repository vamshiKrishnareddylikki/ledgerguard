public class BankApp {
    public static void main(String[] args){
        Account priya = new Account("ACC-1001", "Priya");
        Account rahul = new Account("ACC-1002", "Rahul");


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
    }
}
