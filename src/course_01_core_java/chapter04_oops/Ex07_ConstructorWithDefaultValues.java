package course_01_core_java.chapter04_oops;


class Car {
    // 1. Excellent Encapsulation and Immutability
    private final String make;
    private final String model;
    private final int year;

    // 2. Default Constructor (If NO values are provided)
    // This calls the parameterized constructor with safe default values
    public Car() {
        this("Unknown Make", "Unknown Model", 2000);
    }

    // 3. Parameterized Constructor (With Validation)
    public Car(String make, String model, int year) {

        // Using trim().isEmpty() to catch blank spaces like "   "
        this.make = (make == null || make.trim().isEmpty()) ? "Unknown Make" : make;
        this.model = (model == null || model.trim().isEmpty()) ? "Unknown Model" : model;

        // Year validation
        this.year = (year <= 0) ? 2000 : year;
    }

    // 4. Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // 5. Override toString for easy printing
    @Override
    public String toString() {
        return getMake() + " | " + getModel() + " | " + getYear();
    }
}

public class Ex07_ConstructorWithDefaultValues {
    static void main(String[] args) {
        System.out.println("--- Test 1: All Valid Inputs ---");
        Car car1 = new Car("TATA", "Nexon", 2022);
        System.out.println(car1);

        System.out.println("\n--- Test 2: Invalid Inputs (Nulls/Negatives) ---");
        // User tries to break it with empty strings and negative years
        Car car2 = new Car("", " ", -1);
        System.out.println(car2);

        System.out.println("\n--- Test 3: Arguments Not Provided ---");
        // User provides absolutely nothing using the Default Constructor
        Car car3 = new Car();
        System.out.println(car3);
    }
}
