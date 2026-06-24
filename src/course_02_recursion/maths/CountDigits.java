package course_02_recursion.maths;

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int n){
        if(n<10){
            return 1;
        }
        return 1+countDigits(n/10);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number of Digits in "+num+" = "+countDigits(num));
        }
        else{
            System.out.println("Invalid Input!!");
        }

        sc.close();
    }
}
