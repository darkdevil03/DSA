package course_01_core_java.chapter04_oops;


class Car{
    private final String make;
    private final String model;
    private final int year;
    static int unknownIdCount = 0;

    public Car(String make, String model, int year) {
        this.make = ((make == null) || make.isEmpty()) ? ("Indian " + unknownIdCount) : make;
        this.model = ((model == null) || model.isEmpty()) ? ("Car "+unknownIdCount++): model;
        this.year = (year <= 0) ? 2000 : year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public String toString(){
        return getMake() + " | " + getModel() + "  | " + getYear();
    }
}

public class Ex07_ConstructorWithDefaultValues {
     static void main() {
        System.out.println("Make |"+" Model |"+" Year ");
        Car car1 = new Car("TATA", "Tatu", 1990);
        System.out.println(car1);
        Car car2 = new Car("","",-1);
        System.out.println(car2);
    }
}
