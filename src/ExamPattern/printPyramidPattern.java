package ExamPattern;

/*
    Print Pyramid Pattern Representation (n=6) :

         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *

*/

import java.util.Scanner;

public class printPyramidPattern {

    // Print pyramid pattern method
    static void printPyramid(int n) {

        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main method for sample test case
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of levels for triangle : ");

        int n = in.nextInt();

        printPyramid(n);
    }



}
