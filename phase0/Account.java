public class Account {
    String accountNumber;
    String ownerName;
    double balance;
    static int totalAccountsOpened;

    Account(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        totalAccountsOpened++;      // does exactly the same as count = count + 1;
    }
}
