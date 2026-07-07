package course_01_core_java.chapter04_oops.concept02_static;


class MathUtility{
    public static int sum(int a, int b){
        System.out.print("Sum of integers is: ");
        return a+b;
    }

}

public class Ex03_StaticMethods {
    static void main() {
        System.out.println(MathUtility.sum(1, 2));
    }
}
