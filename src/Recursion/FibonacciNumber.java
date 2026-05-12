package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

    static  int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for fibonacci number : ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.print("Result : "+fibonacci(num));
        }

    }
}
