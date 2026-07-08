package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000.
              Print the value of 'initialValue' before and after creating an instance of "Initializer".
*/

class Initializer{
    static int initialValue;

    static{
        initialValue = 10;
        System.out.println("static block: initialValue initialized to " + initialValue);
    }

}
public class Ex04_StaticBlock {
    static void main() {
        System.out.println("Before initialization: "+Initializer.initialValue);
        Initializer initializer1 = new Initializer();
        System.out.println("After initialization: "+Initializer.initialValue);
    }
}
