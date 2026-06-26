package course_01_core_java.chapter04_oops;

/*
    Question : Write a Java program to create a class called Dog with instance variables name and color.
               Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
               Print the values of the variables.
*/

class Dog{
    private String name;
    private String color;

    Dog(String name,String color){
        this.name = name;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
}


public class Ex02_ParameterizedConstructor {
    public static void main(String[] args) {
        Dog dogObject = new Dog("puffy","red");
        System.out.println("Dog name : "+dogObject.getName());
        System.out.println("Dog color : "+dogObject.getColor());
    }
}
