package course_02_recursion.maths;

import java.util.Scanner;

public class FibonacciNumber {

    static  int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth for Fibonacci number : ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.print("Result : "+fibonacci(num));
        }

        sc.close();
    }
}
