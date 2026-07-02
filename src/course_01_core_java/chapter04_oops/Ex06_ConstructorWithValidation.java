package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Account with instance variables accountNumber and balance.
              Implement a parameterized constructor that initializes these variables with validation:
                accountNumber should be non-null and non-empty.
                balance should be non-negative.
                Print an error message if the validation fails.
 */

class Account {
    private final String accountNumber;
    private final double balance;

    // 1. Constructor with Validation
    public Account(String accountNumber, double balance) {

        // Validate Account Number
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            this.accountNumber = "Unknown"; // Assigning a safe fallback value
        } else {
            this.accountNumber = accountNumber;
        }

        // Validate Balance
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            this.balance = 0.0; // Assigning a safe fallback value
        } else {
            this.balance = balance;
        }
    }

    // 2. Standard Getters (Returning data, not printing)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // 3. Overriding toString() for easy printing
    @Override
    public String toString() {
        return "Account Number: " + getAccountNumber() + " | Balance: $" + getBalance();
    }
}

public class Ex06_ConstructorWithValidation {
    static void main() {
        System.out.println("--- Test 1: Invalid Account Number ---");
        Account account = new Account(null, 5000);
        System.out.println(account);

        System.out.println("\n--- Test 2: Valid Account ---");
        Account account1 = new Account("123", 5000);
        System.out.println(account1);

        System.out.println("\n--- Test 3: Invalid Balance ---");
        Account account2 = new Account("456", -11);
        System.out.println(account2);
    }
}