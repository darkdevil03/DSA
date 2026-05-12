package Recursion.Base;

import java.util.Scanner;

public class reverseNumber {

    static int reverseNum(int num){
        if(num<10){
            return num;
        }
        int place=(int)Math.log10(num);

        /* Because 321 is not a perfect power of 10, the result will be a decimal.
           You can estimate where the value falls by looking at the nearest powers of 10^2 = 100 && 10^3 = 1000
           So, 10^x = 321 lies between 2 and 3. It gives float value of 2.506.
           (int)Math.log10(num) Narrowing Casting (Explicit) */

        // System.out.println((int)Math.log10(num)) // for checking...
        
        return ((num%10)*(int)Math.pow(10,place))+(reverseNum(num/10));

    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(reverseNum(num));
    }
}
