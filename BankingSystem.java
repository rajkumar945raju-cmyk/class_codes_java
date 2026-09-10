//Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: " + balance
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankingSystem{
    public static void main(String[] args) {

        BankAccount account = new BankAccount(12345, 5000);

        try {
            account.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}