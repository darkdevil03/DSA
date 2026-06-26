package course_01_core_java.chapter04_oops;

/*
    Question: Write a Java program to create a class called "Book" with instance variables title, author, and price.
              Implement a default constructor and two parameterized constructors:
                -> One constructor takes title and author as parameters.
                -> The other constructor takes title, author, and price as parameters.
                -> Print the values of the variables for each constructor.

    Concepts:
        1. Constructor Overloading (Compile-Time Polymorphism)
            The core requirement of this exercise was to implement Constructor Overloading.
            What is it?
                Overloading is achieved when multiple methods (or constructors) have the exact same name but different parameters.
                In this case, you have three constructors all named Book().
            How does Java know which one to use?
                The method call is resolved at compile time.
                When you type new Book("Book 1", "Author 1"), the Java compiler looks at the arguments provided (two Strings)
                and automatically links it to the constructor that accepts exactly two Strings. This is a form of compile-time polymorphism.

        2. Encapsulation Review
            Encapsulation is the process of wrapping data and methods into a single unit, usually a class, and restricting direct access to the data.
            To achieve this, the data members (title, author, price) are hidden using the private access modifier.
            Safe access to that data is then provided through public getter methods  (getTitle(), getAuthor(), getPrice()).

*/

class Book{
    // 1. Encapsulation & Immutability: Added the 'final' keyword
    private final String title; // By default, String variable null
    private final String author;
    private double price; // By default, 0.0

    // 2. Default Constructor
    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
    }

    // 3. Parameterized Constructor (2 parameters)
    public  Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // 4. Parameterized Constructor (3 parameters) - The "Master" Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 5. Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }
}

public class Ex03_ConstructorOverloading {
    // 6. main method
    static void main(){
        System.out.println("Default Constructor: ");
        Book book1 = new Book();
        System.out.println("Book's title: "+book1.getTitle());
        System.out.println("Book's author: "+book1.getAuthor());
        System.out.println("Book's price: "+book1.getPrice());

        System.out.println("\nParameterized Constructor  takes title and author as parameters: ");
        Book book2 = new Book("Book 1", "Author 1");
        System.out.println("Book's title: "+book2.getTitle());
        System.out.println("Book's author: "+book2.getAuthor());
        System.out.println("Book's price: "+book2.getPrice());

        System.out.println("\nParameterized Constructor takes title, author, and price as parameters: ");
        Book book3 = new Book("Book 2", "Author 2", 20.0);
        System.out.println("Book's title: "+book3.getTitle());
        System.out.println("Book's author: "+book3.getAuthor());
        System.out.println("Book's price: "+book3.getPrice());
    }

}
