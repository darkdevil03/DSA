package ExamPattern;

/*
    Reverse Right Angle Triangle Pattern Representation (for n=6) :

    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

*/

import java.util.Scanner;

public class reverseRightAngleTrianglePattern {

    // Reverse right angle triangle pattern method
    static void  reverseRightAngleTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main method for sample test case
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of level for reverse angle triangle : ");

        int n = in.nextInt();

        reverseRightAngleTriangle(n);
    }


}
