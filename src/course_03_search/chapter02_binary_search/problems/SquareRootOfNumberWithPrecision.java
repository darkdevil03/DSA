package course_03_search.chapter02_binary_search.problems;

/*
    Problem Statement: Find the Precise Square Root without built-in methods

    Description
        Given a positive integer num and an integer p, write a program to find the square root of num precise up to p decimal places.

        Your solution should first find the integer part of the square root efficiently in log(n), and then calculate the fractional part incrementally up to the specified precision evaluation( 1 <= p <= 5).
        But print till five point decimal value as shown in sample test cases.



        Input Format
            The first line contains an integer num, representing the number whose square root needs to be found.
            The second line contains an integer p, representing the number of decimal places for precision.

        Output Format
        Print a single floating-point number representing the square root, formatted to exactly p decimal places.

        Sample Test Cases

           |------------|----------------|-------------|
           | Test Case  |       1        |      2      |
           |------------|----------------|-------------|
           | Input      |       5        |      4      |
           |------------|----------------|-------------|
           | Output     |    2.23600     |   2.00000   |
           |------------|----------------|-------------|


    Time complexity: O( log(num) + p )

    1. The Binary Search Phase (Integer Part): O(log(num))
            In this loop, you are searching for the integer part of the square root between 0 and num.
            Usually, a standard square root binary search scans the range from 0 to num, which takes O(log(num)) time.
            Note in our code's ::  { loop condition is while (start <= (end / 2)).
                                     Because you are dividing end by 2 on every check, the search space shrinks exceptionally fast.
                                     But it actually cuts off prematurely for larger numbers.
                                   }

    2. Decimal Evaluation Phase: (O(p * 10))
       Once the integer part is found, you look for the decimal values using two nested loops:
       --> Outer Loop: Runs exactly p times (once for tenths, once for hundredths, once for thousandths, etc.).
       --> Inner Loop: In the worst-case scenario, the while loop adds the increment (incr) up to 10 times per decimal place before deci * deci exceeds num (since each decimal place only ranges from 0 to 9).
                       Because the inner loop runs a maximum of 10 times per iteration of the outer loop, the time complexity for this phase is:Time part 2 = O(p * 10) = O(p).

*/

import java.util.Scanner;

public class SquareRootOfNumberWithPrecision {
    public static void main(String[] args) {
         // calculated till 3 digits after decimal point is fixed.

        Scanner sc = new Scanner(System.in);

        // For Test Case 1:
        int num = 5;
        int decimalPointValue = 3;  // Here, after decimal point the evaluation till three point only. But print till three point decimal value.

        System.out.printf("Square root of "+num+" = "+"%.5f ",squareRootFindingUsingBinarySearch(num,decimalPointValue));

        System.out.println();

        // For Test Case 2:
        num = 4;
        decimalPointValue = 2;    // Here, after decimal point the evaluation till two point only. But print till three point decimal value.

        System.out.printf("Square root of "+num+" = "+"%.5f ",squareRootFindingUsingBinarySearch(num,decimalPointValue));

    }


    static float squareRootFindingUsingBinarySearch(int num,int p) {

    // 1. The Binary Search Phase (Integer Part) :

        int start = 0;
        int end = num;
        float deci = 0f;

        while (start <= (end/2)) {
            int mid = start + ((end - start) / 2);

            if (num == mid*mid)
                return mid;
            else if (num > mid*mid)
                start = mid + 1;
            else               // (num < mid*mid)
                end = mid - 1;

            deci = mid;

        }

    // 2. Decimal Evaluation Phase:

        float incr=0.1f;

        for (int i = 0; i < p; i++) {      //  O(p)
            while( (deci*deci) <= num){    //  Decimal range : 0-9. So, 10 times here.
                deci += incr;
            }
            deci -= incr;
            incr = incr/10;
        }
        return deci;
    }
}
