public class BankApp {
    public static void main(String[] args){
        Account priya = new Account("ACC-1--1", "Priya");
        Account rahul = new Account("ACC-1002", "Rahul");

        System.out.println(priya.ownerName + " has " + priya.balance);
        System.out.println(rahul.ownerName + " has " + rahul.balance);
        System.out.println("Total accounts: " + Account.totalAccountsOpened);
    }
}
