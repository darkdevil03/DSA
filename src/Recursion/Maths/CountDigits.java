package Recursion.Maths;

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int n){
        if(n<10){
            return 1;
        }
        return 1+countDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 20;//sc.nextInt();
        if(num>0){
            System.out.println("Number of Digits in "+num+" = "+countDigits(num));
        }
        else{
            System.out.println("Invalid Input!!");
        }

    }
}
