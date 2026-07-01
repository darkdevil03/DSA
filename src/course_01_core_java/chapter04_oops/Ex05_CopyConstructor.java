package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Rectangle with instance variables length and width.
              Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
              Print the values of the variables.

    Concept:

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
