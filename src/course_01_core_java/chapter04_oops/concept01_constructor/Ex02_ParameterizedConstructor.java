package course_01_core_java.chapter04_oops.concept01_constructor;

/*
    Question : Write a Java program to create a class called Dog with instance variables name and color.
               Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
               Print the values of the variables.

    Concepts:
    1. Classes (Dog): A class is a blueprint or template used to create objects.
                      It defines the properties (data) and behaviors (methods) that objects of that class will have.
    2. Object (dogObject): An Object in Java is an instance of a class that represents a real-world entity. When you wrote new Dog("puffy", "red"),
                      you brought the blueprint to life and created a specific object with its own unique identity in memory.
    3. The Parameterized Constructor: A Constructor is a special member of a class that is automatically invoked when an object is created.
                      It is primarily used to initialize the object's data members and set up the initial state of an object.
                      By writing Dog(String name, String color), you created a Parameterized Constructor.
                      This forces anyone who wants to create a Dog to provide a name and a color right from the start.
                      It guarantees that no Dog can exist in your program without having these two essential pieces of information.
    4. The 'this' Keyword: In our constructor, we wrote this.name = name;.
                      Because the parameter passed into the constructor (name) has the exact same identifier as the instance variable belonging to the class (name),
                      Java gets confused about which one you are talking about.
                      The 'this' keyword resolves this by explicitly saying: "Take the value of the parameter name and assign it to the instance variable belonging to this specific object."
    5. Immutability (final keyword): By adding the final keyword to our instance variables, we have made the Dog object partially immutable.
                      This is an excellent security and stability practice in software development.
                      If a developer accidentally tries to write code later on that changes the dog's color (this.color = "blue";),
                      the Java compiler will immediately throw a hard error and prevent the program from running, protecting your original data.
*/

class Dog{
    // 1. Encapsulation & Immutability: Added the 'final' keyword
    private final String name;
    private final String color;

    // 2. Parameterized constructor explicitly marked as public
    public Dog(String name,String color){
        this.name = name;
        this.color = color;
    }

    // 3. Getter for name
    public String getName(){
        return name;
    }
    // 4. Getter for color
    public String getColor(){
        return color;
    }
}

public class Ex02_ParameterizedConstructor {
    static void main() {
        // 5. Creating the object and testing
        Dog dogObject = new Dog("puffy","red");
        System.out.println("Dog name : "+dogObject.getName());
        System.out.println("Dog color : "+dogObject.getColor());
    }
}
