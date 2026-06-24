package JavaOOPS;

/*
    Question : Write a Java program to create a class called "Cat" with instance variables name and age.
               Implement a default constructor that initializes the name to "Unknown" and the age to 0.
               Print the values of the variables.
 */

class Cat{

    // Instance variables
    String name;
    int age;

    // Default constructor
    Cat(){
        name = "Unknown";
        age = 0;
    }

    // Print the values
    void printCat(){
        System.out.println(name);
        System.out.println(age);
    }

}


public class DefaultConstructor {

    static  void main(){
        Cat cat = new Cat();
        cat.printCat();
    }

}
