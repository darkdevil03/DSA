package ExamPattern;

/*
    Stair Case Pattern Representation (for n=6) :

         *
        **
       ***
      ****
     *****
    ******

*/

import java.util.Scanner;

public class StairCasePattern {

    // Stair Case Pattern
    static void stairCase(int n) {

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(j>(n-i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    // Main method for sample test case
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of steps level : ");

        int n = in.nextInt();

        stairCase(n);
    }
}
