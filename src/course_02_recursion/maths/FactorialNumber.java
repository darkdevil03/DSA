package course_02_recursion.maths;

import java.util.Scanner;

public class FactorialNumber {

    static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return factorial(n-1)*n;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number for Factorial : ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.println(num+"!"+" = "+factorial(num));
        }

        sc.close();
    }
}
