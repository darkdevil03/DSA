package ExamPattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of pyramid level : ");
        int n = in.nextInt();
        pattern4(n);
    }

    static void pattern1(int n) {
        //printPyramid
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


    static void pattern2(int n) {
        //reverse right angle triangle pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // right angle triangle number pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        //arrow head pattern
        for (int row = 1; row < 2*n; row++) {
            int totalCol= (row<=n)? row : (2*n)-row;
                for (int j = 1; j <= totalCol; j++) {
                    System.out.print("* ");
                }
            System.out.println();

        }
    }



}
