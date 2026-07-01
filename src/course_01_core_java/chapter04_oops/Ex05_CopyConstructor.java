package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called Rectangle with instance variables length and width.
              Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
              Print the values of the variables.

    Concept:

*/

class Rectangle{
    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rec){
        this(rec.width, rec.height);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}

public class Ex05_CopyConstructor {
    static void main() {
        Rectangle rec1 = new Rectangle(10,20);
        System.out.println("Rectangle-1 Length: " +rec1.getWidth());
        System.out.println("Rectangle-1 Width: " + rec1.getHeight());

        Rectangle rec2 = new Rectangle(rec1);
        System.out.println("Rectangle-2 Length: " +rec2.getWidth());
        System.out.println("Rectangle-2 Width: " + rec2.getHeight());
    }
}
