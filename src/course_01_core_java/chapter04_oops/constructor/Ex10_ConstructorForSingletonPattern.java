package course_01_core_java.chapter04_oops.constructor;

/*
    Question: Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
              Implement a private constructor and a public static method to get the single instance of the class.
              Print a message indicating the creation of the instance.

    Concept:
        1. What is the Singleton Pattern?
            The Singleton Pattern is a Creational Design Pattern.
            Its primary goal is to restrict the instantiation of a class to exactly one single object across the entire Java Virtual Machine (JVM).
            It is heavily used in real-world applications for objects that manage shared resources,
            such as Database Connections, Hardware Drivers, or Application Configuration Settings
            (where having multiple copies would cause conflicts or waste heavy amounts of memory).

       2. The Power of the Private Constructor
            In our previous exercises, we used public constructors
            (e.g., public Car(), public Book()) so that the main method could create as many objects as it wanted using the "new" keyword.
            By declaring the constructor as "private", you completely lock out the outside world.
            No other class can write "new SingletonClass()". The class itself is now the only entity with the power to create its own object.

       3. Static Variables and Methods
            Because outside classes cannot use the "new" keyword, they cannot create an object to call methods on.
            Therefore, the getter method must be "static" (public static SingletonClass getInstance()).
            A static method belongs to the Class itself, not to an object, meaning we can call it directly using the class name: SingletonClass.getInstance().
            Consequently, the variable holding the object must also be static so the static method can access it.

       4. Lazy Initialization vs. Eager Initialization
            Our original code used "Lazy Initialization." This means the object is not created until the exact moment someone actually asks for it by calling getInstance().
            This saves computer memory if the object is never requested.
            The alternative is "Eager Initialization" (e.g., private static SingletonClass instance = new SingletonClass();),
            where the object is created the moment the program starts, regardless of whether it is used or not.

       5.(a) Add Instance Variables (The Best OOP Fix):
            In the real world, a Singleton doesn't just exist to be a Singleton;
            it exists to manage some kind of state or data (like a database connection or game settings).
            If we add even just one non-static instance variable and a standard public method to the class,
            IntelliJ will instantly realize, "Oh, this class holds instance data! It's not a utility class; it is an object meant to be created."
            The warning will vanish instantly.
                                            or
         (b) Use an Annotation (The Quick Fix):
            If we are just writing a theoretical Singleton for an exam or exercise, and we don't want to add extra variables,
            we can explicitly tell the IntelliJ compiler to ignore its own rule.
            We do this by adding the @SuppressWarnings annotation right above our constructor or method.
*/

class SingletonClass {
    // Private static variable to hold the single instance
    private static SingletonClass singletonClass;
    private final String status; // To avoid specific warning—"Instantiation of utility class"

    // Private constructor to prevent instantiation
    private SingletonClass(){
        // Print a message indicating the creation of the instance
        this.status = "active";
        System.out.println("Singleton instance created and "+getStatus()+"...!");
    }

    // Public static method to get the single instance of the class
    public static SingletonClass getInstance(){
        // If the single instance is null, create a new instance
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    // ADDED A STANDARD METHOD
    public String getStatus(){
        return this.status;
    }
}

public class Ex10_ConstructorForSingletonPattern {
    static void main() {

        System.out.println("Fetching first instance...");
        SingletonClass singletonClass1 = SingletonClass.getInstance();

        System.out.println("Fetching second instance...");
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        if(singletonClass1 == singletonClass2){
            System.out.println("Both instances are the same");
        }else{
            System.out.println("Both instances are not the same");
        }
    }

}
