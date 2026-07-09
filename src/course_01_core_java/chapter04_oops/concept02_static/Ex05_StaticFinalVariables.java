package course_01_core_java.chapter04_oops.concept02_static;

/*
    Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
    Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
    Demonstrate the method in the main method.
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
