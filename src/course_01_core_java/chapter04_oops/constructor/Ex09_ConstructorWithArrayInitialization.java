package course_01_core_java.chapter04_oops.constructor;
/*
    Question: Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
              Implement a parameterized constructor that initializes these variables.
              Print the values of the variables.

    Concept:
        1. Array Literals & Anonymous Arrays
            -> Array Literal: Instead of declaring the size and assigning indexes one by one,
                              we can use curly braces {} to create and populate an array instantly.
                              (e.g., String[] names = {"John", "Mary"};). This makes your code highly readable.

            -> Anonymous Array: If we only need to use an array once (like passing it directly into the Classroom constructor),
                                we don't even need to give it a variable name.
                                we can use an anonymous array: new String[]{"Dev", "Ram"}. This saves memory and lines of code.

        2. The Arrays Utility Class
                We used this perfectly! java.util.Arrays is a built-in helper class in Java that provides static methods to
                manipulate arrays (sorting, searching, and comparing).
                Arrays.toString() is the industry standard for converting array contents into a readable format [element1, element2]
                without having to write your own for-loop to print them.
 */
import java.util.Arrays;

class Classroom{
    // 1. Encapsulation
    private final String className;
    private final String[] students;

    // 2. Parameterized Constructor
    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    // 3. Getters
    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    // 4. Override toString for easy printing
    public String toString() {
        return "Classroom{" + "className = " + this.getClassName() + ", students = " + Arrays.toString(this.getStudents()) + '}';
    }
}

public class Ex09_ConstructorWithArrayInitialization {
    static void main() {

        System.out.println("--- Classroom 1 ---");
        // Optimized Array Initialization (Array Literal)
        String[] classFirstStudents = {"John","Doe","Mary"};
        Classroom classroom1 = new Classroom("First", classFirstStudents);
        System.out.println(classroom1);

        System.out.println("\n--- Classroom 2 ---");
        // Advanced Optimization: Anonymous Array
        // We can create and pass the array directly inside the constructor call!
        Classroom classroom2 = new Classroom("Second", new String[]{"Ram", "Devi", "Laxman"});
        System.out.println(classroom2);
    }
}
