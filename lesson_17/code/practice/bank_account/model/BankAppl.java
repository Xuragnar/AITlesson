package practice.bank_account.model;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount acc0 = new BankAccount(100L, "Bill Smith", "Bank#1", 1, 100.0);
        acc0.display();
        System.out.println(acc0.getOwner());
        System.out.println(acc0.getBalance());
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
    }
}
