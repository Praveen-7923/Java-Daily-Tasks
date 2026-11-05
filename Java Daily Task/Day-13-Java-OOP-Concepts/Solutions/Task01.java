class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Task01 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.deposit(2000);
        account.displayBalance();
    }
}