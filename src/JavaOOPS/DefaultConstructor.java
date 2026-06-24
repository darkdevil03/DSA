package JavaOOPS;

/*
    Question : Write a Java program to create a class called "Cat" with instance variables name and age.
               Implement a default constructor that initializes the name to "Unknown" and the age to 0.
               Print the values of the variables.

    Concepts:
             1. Encapsulation (private variables)
                In standard OOP, we should use Encapsulation. Encapsulation is the process of wrapping data and methods into a single unit,
                usually a class, and restricting direct access to the data. To achieve this, data members are hidden using the private access modifier.
                This prevents outside classes from accidentally messing with the Cat's data directly.
             2. Constructors
                A constructor is a special member of a class that is automatically invoked when an object is created.
                It is primarily used to initialize the object's data members and set up the initial state of an object.
                we successfully created a Default Constructor, which is a constructor that does not accept any parameters
                and initializes an object with default values. We simply added the public access modifier to our
                explicitly state that any other class can create a Cat object.
            3. The 'this' Keyword While not strictly required in our specific constructor since there are no parameter names clashing with variable names,
               using this.name and this.age is a great habit to form. It makes our code highly readable by explicitly signaling,

 */

class Cat{
    // 1. Encapsulation: Make instance variables private
    String name;
    int age;

    // 2. Default constructor explicitly marked as public
    public Cat(){
        // 3. Using 'this' keyword for clarity
        // "I am modifying the instance variable belonging to this specific object."
        this.name = "Unknown";      // <- name = "Unknown";
        this.age = 0;               // <- age = 0;
    }

    // 4. Method to print the values
    public void printCat(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class DefaultConstructor {
    // 5. Main method
    static  void main(){
        Cat cat = new Cat();
        cat.printCat();
    }
}
