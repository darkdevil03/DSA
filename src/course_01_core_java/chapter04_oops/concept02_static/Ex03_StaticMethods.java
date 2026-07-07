package course_01_core_java.chapter04_oops.concept02_static;

/*
    Question: Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum.
              Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
*/

class MathUtility{
    public static int sum(int a, int b){
        System.out.print("Sum of integers is: ");
        return a+b;
    }

}

public class Ex03_StaticMethods {
    static void main() {
        System.out.println(MathUtility.sum(1, 2));
    }
}
