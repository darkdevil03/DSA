package course_01_core_java.chapter04_oops.concept02_static;

/*
    Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
    Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
    Demonstrate the method in the main method.
*/

class Constants{

    private static final double PI = 3.14159;

    public double area(double radius){
        return PI * radius * radius;
    }

}
public class Ex05_StaticFinalVariables {
    static void main() {
       Constants cons = new Constants();
       System.out.println("Area of circle with radius : " +cons.area(2.212));
    }
}
