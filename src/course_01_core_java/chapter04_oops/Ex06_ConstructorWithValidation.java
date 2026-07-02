package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Account with instance variables accountNumber and balance.
              Implement a parameterized constructor that initializes these variables with validation:
                accountNumber should be non-null and non-empty.
                balance should be non-negative.
                Print an error message if the validation fails.

    Concept:
        1. Constructor Validation (Protecting Object State)
           A constructor is automatically invoked when an object is created.
           Constructors help initialize object properties during object creation.
           By putting our validation logic inside the constructor, we are creating a "gatekeeper."
           When we execute new Account("456", -11), the constructor immediately catches the -11.
           It prints the required error message and sets the balance to a safe default of 0.0.
           This guarantees that no Account object can ever exist in our program with a corrupted state.
           (Note: I removed the final keyword from our instance variables because if validation fails,
           and we must assign a fallback value conditionally, managing final gets slightly more complex.
           In professional Java, instead of just printing an error, developers throw an IllegalArgumentException which instantly crashes that part of the program
           and prevents the object from being created entirely.)
        2. The Separation of Concerns
           -> (Getters vs. Display)In professional software development, we should separate your data logic from your display logic.
              The Getter (getBalance()) should solely be responsible for handing the data back to whoever asked for it.
           -> The Test Driver (your main method) or our toString() method should be responsible for formatting and printing that data to the console.
              If we mix them up (by putting System.out.println() inside our getters), it makes our Account class useless for graphical applications (like a mobile app or website)
              because those applications don't use the console to display text!
 */

class Account {
    private String accountNumber;
    private double balance;

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