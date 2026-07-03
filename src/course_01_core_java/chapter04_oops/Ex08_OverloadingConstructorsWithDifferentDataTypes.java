package course_01_core_java.chapter04_oops;

class Point {
    // 1. Encapsulation and Immutability
    private final double x;
    private final double y;

    // 2. Overloaded Constructor (Takes Integers)
    public Point(int x, int y) {
        // 3. Constructor Chaining (Passes values to the double constructor)
        // FIXED: Explicitly cast the integers to doubles! Because to avoid loop over itself passing int values.
        // This forces Java to call the Point(double x, double y) constructor.
        // Casting 'x' to 'double' is redundant
        // Java automatically promotes the int values to double for other variable if it requires.
        this( x, (double)y);   // or this( (double) x, y);
    }

    // 4. Main Parameterized Constructor (Takes Doubles)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 5. Standard Getters (One per instance variable)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // 6. Override toString for easy printing
    @Override
    public String toString() {
        return "Point { x = " + this.getX() + ", y = " + this.getY() + " }";
    }
}

public class Ex08_OverloadingConstructorsWithDifferentDataTypes {
    static void main() {
        System.out.println("--- Using Integer Constructor ---");
        Point p1 = new Point(1, 2);
        System.out.println("p1: " + p1);

        System.out.println("\n--- Using Double Constructor ---");
        Point p2 = new Point(3.09, 4.09);
        System.out.println("p2: " + p2);
    }
}