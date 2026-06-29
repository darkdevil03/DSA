package course_01_core_java.chapter04_oops;


class Student{
    private final int studentId;
    private final String studentName;
    private final int grade;

    public Student(){
        this(0,"Unknown",0);
    }

    public Student(int studentId, String studentName, int grade) {
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
    public int getGrade() {
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

        Student student2 = new Student();
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.getStudentId());
        System.out.println("Student2 Name: " + student2.getStudentName());
        System.out.println("Student2 Grade: " + student2.getGrade());
    }
}
