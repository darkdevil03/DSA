package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000.
              Print the value of 'initialValue' before and after creating an instance of "Initializer".

    Concept:
        1. What is a Static Block?
          -> A static block (written simply as static { ... }) is a special chunk of code used to set up the Class blueprint itself.
          -> A Constructor is used to set up a specific Object.
          -> A Static Block is used to set up the Class.
          -> It is typically used when setting up a static variable requires complex logic, like connecting to a database, reading a file, or doing math calculations, which cannot be easily done in a single line.

        2. The Execution Order (The Magic of the ClassLoader)
          -> If you look closely at the console output when you run your program, you will notice something fascinating:

          Console Output:
          --- Starting Program ---
          Static Block Executed: initialValue set to 1000
          Before creating object: 1000
          After creating object: 1000

          -> Notice that your static block printed its message BEFORE your main method printed "Before creating object".
          How is this possible?
          -> In Java, the moment you mention a class for the very first time (like writing Initializer.getInitialValue()),
             the Java Virtual Machine (JVM) loads that Class blueprint into memory.
             The absolute very first thing the JVM does during this loading phase is run the Static Block.
          -> It runs exactly one time, and it runs before any objects are created and before any static methods are called.

        3. Why the value stays the same
           When you wrote new Initializer(), you created an object.
           But because the static block already ran when the class was first loaded into memory, it does not run again.
           The static variable belongs to the Class Whiteboard, so it remains safely at 1000 for the rest of the program's life,
           no matter how many objects you create!

    For Warnings resolving:


*/

class Initializer {

    // 1. Encapsulation: Make the static variable private
    private static final int initialValue;

    // 2. The Static Block
    static {
        initialValue = 1000;
        System.out.println("Static Block Executed: initialValue set to " + initialValue);
    }

    // 3. Static Getter for safe access
    public static int getInitialValue() {
        return initialValue;
    }
}

public class Ex04_StaticBlock {
    // Suppress warning because the exercise requires us to instantiate this "Utility" class
    @SuppressWarnings("InstantiationOfUtilityClass")
    static void main() {

        System.out.println("--- Starting Program ---");

        // Accessing the static variable triggers the class to load in memory
        System.out.println("Before creating object: " + Initializer.getInitialValue());

        // Creating an instance of the class (Anonymous instantiation to fix "never used" warning)
        new Initializer();

        // Checking the value again
        System.out.println("After creating object: " + Initializer.getInitialValue());
    }
}
