package course_01_core_java.chapter04_oops;

/*
    Question : Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
               Implement a default constructor and a parameterized constructor that takes all three instance variables.
               Use constructor chaining to initialize the variables.
               Print the values of the variables.

    Concepts:
        Constructor Chaining: Professional Java developers use Constructor Chaining to write cleaner, more maintainable code.
               By using the this() method inside your default constructor, you called another constructor within the same class.
               This centralizes all your variable assignments into a single constructor.

*/

class Student{
    private final int studentId;
    private final String studentName;
    private final String grade;

    public Student(){
        this(0,"Unknown","None");
    }

    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getGrade() {
        return grade;
    }
}

public class Ex04_ChainingConstructors {
    static void main() {
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.getStudentId());
        System.out.println("Student1 Name: " + student1.getStudentName());
        System.out.println("Student1 Grade: " + student1.getGrade());

        Student student2 = new Student(1,"Sathya","A");
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.getStudentId());
        System.out.println("Student2 Name: " + student2.getStudentName());
        System.out.println("Student2 Grade: " + student2.getGrade());
    }
}
