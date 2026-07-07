package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum.
              Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

    Concept:
        1. Static Methods (Class-Level Methods)
            When We declare a method with the "static" keyword, it means the method belongs to the Class blueprint itself,
            rather than to a specific object created from the class.
            Because the method is tied to the blueprint, We do not need to create an object (using the "new" keyword) to use it.
            We can call the method directly by referencing the class name, followed by a dot, and then the method name (e.g., MathUtility.add(1, 2)).
            This is highly efficient for general-purpose tools and mathematical operations where object state (instance variables) is not required.

        2. The Single Responsibility Principle (SRP)
            SRP is a core principle of software design. It states that a class or method should have one, and only one, reason to change.
            By removing the print statement from the "add" method, we adhere to SRP. The "add" method is now purely responsible for arithmetic.
            The "main" method is responsible for presentation. If the business ever decides to change the output text from "Sum of integers is:" to "The result is:",
            We only have to update the presentation layer, leaving the mathematical logic completely untouched and safe from accidental bugs.

        3. The Utility Class Design Pattern
            A Utility Class is a special type of class that exists simply to group together related static methods (like java.lang.Math or java.util.Arrays).
            Because all the methods are static, there is never a logical reason to create an object of this class.
            To enforce this rule, developers explicitly create a "private" constructor.
            This acts as a lock on the class. If another developer attempts to write "MathUtility util = new MathUtility();",
            the Java compiler will throw an immediate error, ensuring the class is used exactly as intended.
*/

class MathUtility {

    // 1. Private constructor to prevent instantiation (Utility Class Standard)
    private MathUtility() {
        // Optional but professional: Throw an error if someone inside the class tries to call it
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // 2. Pure Calculation Method (No printing inside!)
    public static int add(int a, int b) {
        return a + b;
    }
}

public class Ex03_StaticMethods {
    static void main() {
        // 3. Handling the printing and calling the static method directly
        int result = MathUtility.add(1, 2);
        System.out.println("Sum of integers is: " + result);

        // We can also print it directly like this:
        System.out.println("Sum of 10 and 20 is: " + MathUtility.add(10, 20));
    }
}