package course_01_core_java.chapter04_oops;



class Book{
    private final String title; // By default String variable null
    private final String author;
    private double price; // By default 0.0

    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public  Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

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
        System.out.println(book2.getPrice());

        System.out.println("\nParameterized Constructor takes title, author, and price as parameters: ");
        Book book3 = new Book("Book 2", "Author 2", 20);
        System.out.println("Book's title: "+book3.getTitle());
        System.out.println("Book's author: "+book3.getAuthor());
        System.out.println("Book's price: "+book3.getPrice());
    }

}
