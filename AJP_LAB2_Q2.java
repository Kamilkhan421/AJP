import java.util.Scanner;

class Bank {
    double amount;

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method using ternary operator
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        // Deduct amount only if balance is sufficient
        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
    }

    // Deposit method
    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account with initial amount 10000
        Bank account = new Bank(10000);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmt = sc.nextDouble();

        // Perform withdrawal
        account.withdraw(withdrawAmt);

        // Deposit 5000
        account.deposit(5000);

        // Display final balance
        System.out.println("Final Balance: " + account.amount);

        sc.close();
    }
}
