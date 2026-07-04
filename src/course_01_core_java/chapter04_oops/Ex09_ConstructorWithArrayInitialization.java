package course_01_core_java.chapter04_oops;
/*
    Question: Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
              Implement a parameterized constructor that initializes these variables.
              Print the values of the variables.
 */
import java.util.Arrays;

class Classroom{
    private final String className;
    private final String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }
    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    public String toString() {
        return "Classroom{" + "className = " + this.getClassName() + ", students = " + Arrays.toString(this.getStudents()) + '}';
    }
}

public class Ex09_ConstructorWithArrayInitialization {
    static void main() {

        String[] classFirstStudents = new String[3];
        classFirstStudents[0] = "John";
        classFirstStudents[1] = "Doe";
        classFirstStudents[2] = "Mary";

        Classroom classroom1 = new Classroom("First", classFirstStudents);
        System.out.println(classroom1);

        String[] classSecondStudents = new String[3];
        classSecondStudents[0] = "Dev";
        classSecondStudents[1] = "Ram";
        classSecondStudents[2] = "Ravana";

        Classroom classroom2 = new Classroom("Second", classSecondStudents);
        System.out.println(classroom2);


    }
}
