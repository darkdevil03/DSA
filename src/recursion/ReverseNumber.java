package recursion;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNum(int num){
        if(num<10){
            return num;
        }
        int place=(int)Math.log10(num);
        return ((num%10)*(int)Math.pow(10,place))+(reverseNum(num/10));
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println(reverseNum(num));
    }
}
