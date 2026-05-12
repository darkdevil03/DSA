package Recursion;

import java.util.Scanner;

public class SumofDigits {

    static int sumDigits(int n){
        if(n<10){
            return n;
        }
        return sumDigits(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println(sumDigits(num));
        }
        else{
            System.out.println("Invalid Input!!");
        }


    }
}
