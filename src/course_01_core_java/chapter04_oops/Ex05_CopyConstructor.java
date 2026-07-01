package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Rectangle with instance variables length and width.
              Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
              Print the values of the variables.

    Concept:
        1. What is a Copy Constructor?
           A Copy Constructor is a specialized constructor that takes an object of its own class as a parameter.
           In our code, rec2 is not pointing to the same memory location as rec1.
           Instead, rec2 is a brand-new object that is an exact clone of rec1 at the moment it was created.
           This is extremely useful when we want to duplicate an object, perhaps to modify the clone without altering the original data.
        2. Constructor Chaining (The this() call)When we wrote this(rec.width, rec.height); inside our copy constructor, we executed an advanced Java technique.
           Instead of rewriting this.length = rec.length;, we forwarded the cloned values directly to our parameterized constructor.
           This means if we ever want to add validation (like ensuring length is greater than 0),
           we only have to write that if statement once in the main parameterized constructor!

*/

class Rectangle{
    private final double width;
    private final double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(Rectangle rec){
        this(rec.width, rec.length);
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
}

public class Ex05_CopyConstructor {
    static void main() {
        Rectangle rec1 = new Rectangle(10,20);
        System.out.println("Rectangle-1 Width: " +rec1.getWidth());
        System.out.println("Rectangle-1 Length: " + rec1.getLength());

        Rectangle rec2 = new Rectangle(rec1);
        System.out.println("Rectangle-2 Width: " +rec2.getWidth());
        System.out.println("Rectangle-2 Length: " + rec2.getLength());
    }
}
