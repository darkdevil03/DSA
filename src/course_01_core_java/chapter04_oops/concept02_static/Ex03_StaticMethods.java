package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum.
              Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
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

        // You can also print it directly like this:
        System.out.println("Sum of 10 and 20 is: " + MathUtility.add(10, 20));
    }
}