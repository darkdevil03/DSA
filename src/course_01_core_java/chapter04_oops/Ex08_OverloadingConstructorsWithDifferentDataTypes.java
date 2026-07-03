package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Point with instance variables x and y.
              Implement overloaded constructors:

              ->  One constructor takes int parameters.
              ->  Another constructor takes double parameters.
              ->  Print the values of the variables for each constructor.
    Concepts:
        1. Constructor Overloading (Compile-Time Polymorphism)
            This is a form of Compile-time Polymorphism. It is achieved when multiple methods (or constructors) have the same name but different parameters.
            When you type new Point(1, 2) versus new Point(3.09, 4.09), the Java compiler looks at the data types of the arguments you provided.
            The method call is resolved at compile time. It automatically maps our request to the correct constructor based on whether we passed integers or decimal numbers.
        2. Implicit Type Casting (Widening Conversion)
            we might wonder how this(x, y); works inside the integer constructor when it is calling a constructor that demands double parameters.
            In Java, an int takes up 32 bits of memory, while a double takes up 64 bits.
            Because an int is smaller, Java can safely and automatically convert an int into a double without losing any data.
            This is called a "Widening Conversion" or "Implicit Casting."
            The integer 1 automatically becomes the decimal 1.0.
        3. Encapsulation
            our decision to use private variables was spot on. Encapsulation is the process of wrapping data and methods into a single unit,
            usually a class, and restricting direct access to the data.
            It acts as a protective shield that prevents data from being accessed directly from outside the class.
            Access to data is then safely provided through public getter methods.
        4. Parameterized Constructor
            By writing constructors that accept values, we are utilizing Parameterized Constructors.
            A constructor that accepts parameters is used to initialize an object with specific values.
            This ensures that every Point object created in our application has valid x and y coordinates from the very exact moment it is brought into existence.
*/

class Point {
    // 1. Encapsulation and Immutability
    private final double x;
    private final double y;

    // 2. Overloaded Constructor (Takes Integers)
    public Point(int x, int y) {
        // 3. Constructor Chaining (Passes values to the double constructor)
        // FIXED: Explicitly cast the integers to doubles! Because to avoid loop over itself passing int values.
        // This forces Java to call the Point(double x, double y) constructor.
        // Casting 'x' to 'double' is redundant
        // Java automatically promotes the int values to double for other variable if it requires.
        this( x, (double)y);   // or this( (double) x, y);
    }

    // 4. Main Parameterized Constructor (Takes Doubles)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 5. Standard Getters (One per instance variable)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // 6. Override toString for easy printing
    @Override
    public String toString() {
        return "Point { x = " + this.getX() + ", y = " + this.getY() + " }";
    }
}

public class Ex08_OverloadingConstructorsWithDifferentDataTypes {
    static void main() {
        System.out.println("--- Using Integer Constructor ---");
        Point p1 = new Point(1, 2);
        System.out.println("p1: " + p1);

        System.out.println("\n--- Using Double Constructor ---");
        Point p2 = new Point(3.09, 4.09);
        System.out.println("p2: " + p2);
    }
}