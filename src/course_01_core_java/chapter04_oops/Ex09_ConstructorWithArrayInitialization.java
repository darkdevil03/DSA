package course_01_core_java.chapter04_oops;
/*
    Question: Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
              Implement a parameterized constructor that initializes these variables.
              Print the values of the variables.
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
