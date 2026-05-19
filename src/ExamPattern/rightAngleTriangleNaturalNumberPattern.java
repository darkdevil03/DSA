package ExamPattern;

/*
    Right Angle Triangle Natural Number Pattern Representation (for n=6) :

    1
    12
    123
    1234
    12345
    123456
*/

import java.util.Scanner;

public class rightAngleTriangleNaturalNumberPattern {

    // Right angle triangle natural number pattern method
    static void RightAngleTriangleNaturalNumber(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


    // Main method for sample test case
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of natural number levels : ");

        int n = in.nextInt();

        RightAngleTriangleNaturalNumber(n);
    }
}
