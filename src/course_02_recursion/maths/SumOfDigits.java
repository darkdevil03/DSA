package course_02_recursion.maths;

import java.util.Scanner;

public class SumOfDigits {

    static int sumDigits(int n){
        if(n<10)
            return n;

        return sumDigits(n/10)+n%10;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for sum of digits calculation : ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println(sumDigits(num));
        }
        else{
            System.out.println("Invalid Input!!");
        }

        sc.close();
    }
}
