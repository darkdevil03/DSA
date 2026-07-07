package course_01_core_java.chapter04_oops.static_concept;

/*
    Question: Write a Java program to create a class called "Counter" with a static variable count.
              Implement a constructor that increments count every time an object is created.
              Print the value of count after creating several objects.

    Concept:
        1. Instance Variables vs. Static Variables (The Whiteboard Analogy)
            To truly understand the "static" keyword, imagine a physical classroom.
            -> An Instance Variable is like a notebook given to every student.
               If Student A writes "Hello" in their notebook, it does not affect Student B's notebook.
               Every object (student) gets its own unique copy of the data.
            -> A Static Variable is like the large whiteboard at the front of the classroom.
               There is only ONE whiteboard, and every student in the room shares it.
               If Student A walks up and erases the whiteboard to write "Goodbye", Student B will also see "Goodbye".

        2. How our Code Uses the Whiteboard
            When we write "private static int count = 0;", we are creating a whiteboard.
            -> Every time we use "new Counter()", a new student enters the room.
               Our constructor logic ("count++;") tells that new student to walk up to the whiteboard, erase the current number, and write the next number up.
            -> Because there is only one whiteboard, by the time "counter4" is created, the whiteboard says 4.
               If we ask "counter1" what number is on the board, it will also look up and see 4.
               This is why all of our objects ultimately printed the exact same number at the end of our original code!

        3. Static Methods
            Just as static variables belong to the Class (the room) rather than the Object (the student), we can also have Static Methods.
            "public static int getCount()" is a method that can be called even if zero objects have been created yet.
            We call it by using the Class name directly: "Counter.getCount();".
            This is how Java's built-in Math class works; we type "Math.max(5, 10)" without ever needing to create a "new Math()" object.

            -> The Core Problem: The "Chicken and the Egg"
                Imagine we are building an application, and we want to check how many Counter objects exist before we do anything else.
                If no objects have been created, the count should be 0.

            Scenario A: Using an Instance Method (The Wrong Way)
                If we write public int getCounter() without the static keyword, it is an instance method.
                By definition, instance methods can only be called by a physical object.

                To call that method, we must have an object:

                Java Code:
                // We want to know the count. But to call the instance method,
                // we are FORCED to create an object first!
                    Counter tempCounter = new Counter();
                    System.out.println(tempCounter.getCounter());

                The Fatal Flaw: we wanted to check if the count was 0.
                                But because we were forced to use new Counter() just to access the method,
                                our constructor ran, the count increased, and our output says 1.
                                We h`ave permanently altered your data just trying to look at it!

            Scenario B: Using a Static Method (The Correct Way)
                When we write public static int getCount(), the method belongs to the Class Blueprint itself, not to the objects.
                We do not need to create an object to ask the blueprint a question.

                Java Code:
                // We ask the Class directly. No objects are created.
                    System.out.println(Counter.getCount()); // Output is safely 0!

            The Two Golden Rules of Static/Instance Memory:
                Because of how Java handles computer memory, these rules are strictly enforced by the compiler:

                1. Instance Methods can access EVERYTHING.
                    Because an object is created from the class blueprint,
                    an object can see everything inside itself (instance variables) AND everything on the blueprint (static variables).

                2. Static Methods can ONLY access Static Variables.
                    If we make a method static, it has no idea what objects exist in the heap memory.
                    If we try to put this.name inside a static method,
                    Java will throw a hard Compile Error: "Non-static variable cannot be referenced from a static context."
                    The compiler is essentially saying: "I am the Class Blueprint.
                    we asked for a name, but which object's name do you want? I don't know who they are!"
*/


class Counter {

    // 1. Static variable shared among all instances
    private static int count = 0;

    // 2. Constructor increments the shared count
    public Counter() {
        count++;
    }

    // 3. Static Getter: Best practice for accessing static variables
    public static int getCount() {
        return count;
    }

    // 4. Overriding toString for clean output
    @Override
    public String toString() {
        // Notice we do not use 'this.count' because it belongs to the class
        return "Total Objects Created: " + count;
    }
}

public class Ex01_StaticVariables {

    // Using modern Java main method
    static void main() {

        // For check Zero object creation
        System.out.println("Total Count tracked by Class: " + Counter.getCount());

        System.out.println("--- Creating First Two Objects ---");
        Counter counter1 = new Counter();
        System.out.println("Counter 1 sees: " + counter1);

        Counter counter2 = new Counter();
        System.out.println("Counter 2 sees: " + counter2);

        System.out.println("\n--- Creating Two More Objects ---");
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        // 5. Professional way to call static methods using the Class Name
        System.out.println("Total Count tracked by Class: " + Counter.getCount());

        System.out.println("Counter 3 sees: " + counter3);
        System.out.println("Counter 4 sees: " + counter4);
    }
}
