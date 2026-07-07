package course_01_core_java.chapter04_oops.static_concept;


class Counter{
    private static int counter = 0;

    public Counter(){
        counter++;
    }

    private int getCounter(){
        return counter;
    }

    public String toString(){
        return "Counter: " + this.getCounter();
    }
}

public class Ex01_StaticVariables {

    static void main(){
        System.out.println("Printing counters object 1 & 2 one by one:");
        Counter counter1 = new Counter();
        System.out.println(counter1);
        Counter counter2 = new Counter();
        System.out.println(counter2);

        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        System.out.println("Printings counters after the objects 3 & 4 :");

        System.out.println(counter3);
        System.out.println(counter4);

    }
}
