package OOPS_Programming2;

public class BankAccount {
    public static String bankName="Bank of Baroda";
    static int numberOfAccounts=0;
    final int acoountNumber;

    String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.acoountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        numberOfAccounts++;
    }
    void getTotalAccounts(){
        System.out.println("Total number of accounts: " + numberOfAccounts);
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(9563,"Divyansh");
        bankAccount.getTotalAccounts();
    }
}
