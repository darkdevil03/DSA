package Recursion;

import java.util.Scanner;

public class SumofNaturalNumbers {

    static int summation(int n){
        if(n==1){
            return 1;
        }
        return summation(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural Number of range for summation : ");
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
