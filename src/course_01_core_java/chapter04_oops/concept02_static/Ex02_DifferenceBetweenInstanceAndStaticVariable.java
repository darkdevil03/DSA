package course_01_core_java.chapter04_oops.concept02_static;

/*
Concept:
    To truly master Java, we have to understand how it organizes memory.
    This concept of Static (Class-level) versus Instance (Object-level)
    memory is the exact reason why the main method in Java is always public static void main!

    To explain this clearly, let's use the "Classroom Analogy".
    -> Static Variables = The Whiteboard. It is bolted to the front of the room.
                          There is only one whiteboard, and it belongs to the whole classroom.
    -> Instance Variables = The Student's Notebook. Every student (Object) gets their own unique notebook.
    -> Methods = Actions someone takes.

    Here is the step-by-step breakdown with code examples to prove how this works.

    1. Instance Methods can access EVERYTHING:
        An Instance Method is an action performed by a specific, physical object (a specific student).
        Imagine we ask a specific student, John, to introduce himself.
        Because John physically exists in the room, he can look down at his own Notebook (Instance variable) to read his name.
        He can also look up at the Whiteboard (Static variable) to read the name of the school.
        Because the object exists, it has full access to its own personal data and the shared global data
 */
class StudentStaticAndInstance {
    // STATIC (The Whiteboard): Shared by everyone
    static String schoolName = "Global High School";

    // INSTANCE (The Notebook): Unique to each object
    String studentName;

    // Constructor to give the student a name
    public StudentStaticAndInstance(String name) {
        this.studentName = name;
    }

    // --- INSTANCE METHOD ---
    public void introduce() {
        // SUCCESS: It can access its own instance variable
        System.out.println("My name is " + this.studentName);

        // SUCCESS: It can also access the static variable
        System.out.println("I attend " + schoolName);
    }
}

/*
    2. Static Methods can ONLY access Static Variables
        A Static Method is an action performed by the Class blueprint itself. It does not belong to any specific object.
        Imagine an announcement coming over the school Intercom System. The intercom is just a speaker attached to the building (the Class blueprint).
        The intercom can easily announce what is written on the Whiteboard (Static variables) because the whiteboard belongs to the building.
        The Error: What happens if the intercom says, "Please read what is written on page 2 of wer Notebook"?
        The intercom doesn't know if there are 100 students in the room, 5 students, or zero students. The intercom doesn't have a notebook of its own.
        In Java, if a static method tries to access an instance variable,
        the compiler panics and throws an error because it has no physical object to pull that data from.
*/

class StudentStaticMethods {
    // STATIC (The Whiteboard)
    private static final String schoolName = "Global High School";

    // INSTANCE (The Notebook)
    String studentName;

    public StudentStaticMethods(String name) {
        this.studentName = name;
    }

    // --- STATIC METHOD ---
    public static void makeAnnouncement() {
        // SUCCESS: The static method can see the static variable
        System.out.println("Welcome to " + schoolName);
        // this.studentName = "John"; // we get error for this line if we use non-static variable in static method

        // CRITICAL ERROR: The static method CANNOT see instance variables
        // System.out.println("Welcome, " + this.studentName);
        // If we uncomment the line above, Java will throw:
        // "Non-static variable cannot be referenced from a static context."
    }
}


public class Ex02_DifferenceBetweenInstanceAndStaticVariable {
    static void main() {

        System.out.println("1. Instance Methods can access EVERYTHING");
        StudentStaticAndInstance john = new StudentStaticAndInstance("John");
        john.introduce(); // John successfully reads his notebook AND the whiteboard

        System.out.println("\n2. Static Methods can ONLY access Static Variables ");
        // Notice we don't even need to create a Student object!
        // We call the static method directly from the Class blueprint.
        System.out.print("Invoke by class : ");
        StudentStaticMethods.makeAnnouncement();
        // Whereas the student name has to be called by respective object
        StudentStaticMethods student1 = new StudentStaticMethods("john");
        System.out.println("Called by object : "+student1.studentName);
    }
}
