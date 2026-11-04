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
    }
}
