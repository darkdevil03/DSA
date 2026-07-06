package course_01_core_java.chapter04_oops;

class SingletonClass {
    // Private static variable to hold the single instance
    private static SingletonClass singletonClass = null;

    // Private constructor to prevent instantiation
    private SingletonClass(){
        // Print a message indicating the creation of the instance
        System.out.println("\n--- Singleton instance created ---");
    }

    // Public static method to get the single instance of the class
    public static SingletonClass getInstance(){
        // If the single instance is null, create a new instance
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
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
