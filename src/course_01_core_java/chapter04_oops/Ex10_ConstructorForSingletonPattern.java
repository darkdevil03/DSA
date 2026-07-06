package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
              Implement a private constructor and a public static method to get the single instance of the class.
              Print a message indicating the creation of the instance.
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
