package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
              Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
              Demonstrate the method in the main method.

    Concept:
        1. The Power of "static final" (Creating Constants)
            -> When you combine static and final, you create a Constant.
            -> static: The variable belongs to the Class Whiteboard.
                       There is only one copy of it in memory, shared by the entire application.
            -> final: The variable is locked. Once it is assigned a value (like 3.14159),
                      it can never be changed or reassigned.
            -> By combining them, you create a memory-efficient, unchangeable, globally accessible piece of data.
               The standard naming convention for static final variables in Java is to use all uppercase letters
               with underscores separating words (e.g., MAX_SPEED, DEFAULT_TIMEOUT, PI).
        2. Pure Functions (Static Math Methods)
            -> A "pure function" is a method where the output relies entirely on the input parameters provided,
               without needing to look at any external object state.
            -> The area of a circle is purely a mathematical calculation: Area = PI * radius * radius.
                Because it doesn't need to know the state of a specific object, the method should be marked as static.
                This allows developers to just call Constants.calculateArea(5.0) without wasting computer memory creating
                a useless Constants object first.
        3. Protecting Utility Classes
            Just as we learned in previous exercises, a class composed entirely of static variables and static methods is called a Utility Class.
            To forcefully prevent other developers from accidentally writing new Constants(), professional developers add a private constructor to the class.
            This acts as a security lock, throwing a compile error if anyone attempts to instantiate it.
*/

class Constants {

    // 1. Standard Constant Declaration (public, static, and final)
    // Naming convention: Constants are always ALL_CAPS
    public static final double PI = 3.14159;

    // 2. Private constructor to prevent object instantiation
    private Constants() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // 3. Static method (No object required to call this)
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Ex05_StaticFinalVariables {

    static void main() {
        double radius = 2.212;

        // 4. Accessing both the constant and the method directly via the Class Name
        System.out.println("Using Constant PI: " + Constants.PI);
        System.out.println("Area of circle with radius " + radius + " is: " + Constants.calculateArea(radius));
    }
}
