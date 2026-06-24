package JavaOOPS;

class Cat{

    String name;
    int age;

    Cat(){
        name = "Unknown";
        age = 0;
    }

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
