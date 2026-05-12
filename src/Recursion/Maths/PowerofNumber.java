package Recursion.Maths;

import java.util.Scanner;

public class PowerofNumber {

    static float expPower(float b,int p){
        if(p==0){
            return 1.00000f;
        }
        return (float) expPower(b,p-1)*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a base number and power of a number : ");
        float base = sc.nextFloat();
        int power = sc.nextInt();
        if(base<=0 || power<0){
            System.out.println("Invalid Input!!");
        }
        else{
            System.out.print(base+" ^ "+power+" = ");
            System.out.printf("%.5f",expPower(base,power));
        }

        sc.close();
    }
}
