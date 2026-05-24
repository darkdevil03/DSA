package ExamPattern;

/*
    Front Arrow Head Pattern Representation (for n=6) :

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
 */
import java.util.Scanner;

public class FrontArrowHeadPattern {

    // Front arrow head pattern method
    static void frontArrowHead(int n) {

        for (int row = 1; row < 2*n; row++) {
            int totalCol= (row<=n)? row : (2*n)-row;
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // Main method for sample test case
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of levels : ");

        int n = in.nextInt();

        frontArrowHead(n);
    }
}
