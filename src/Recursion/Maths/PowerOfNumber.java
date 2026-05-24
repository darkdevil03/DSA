package Recursion.Maths;

import java.util.Scanner;

public class PowerOfNumber {

    static float expPower(float b,int p){
        if(p==0){
            return 1.0000f;
        }
        return expPower(b,p-1) *b;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number for power calculation : ");
        float base = sc.nextFloat();
        System.out.print("Enter the power for base " + base +" : " );
        int power = sc.nextInt();

        if(base<=0 || power<0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.print(base+" ^ "+power+" = ");
            System.out.printf("%.4f",expPower(base,power));
        }

        sc.close();
    }
}
