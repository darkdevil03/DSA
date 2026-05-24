package Recursion.Maths;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    static int summation(int n){
        if(n==1)
            return 1;

        return summation(n-1)+n;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number range for summation calculation : ");
        int range = sc.nextInt();

        if(range<=0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.println("Sum of "+range+" natural numbers : "+ summation(range));
        }

        sc.close();
    }

}
