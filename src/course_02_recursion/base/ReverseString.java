package course_02_recursion.base;

import java.util.Scanner;

public class ReverseString {

    static String reverseString(String str, int len){
        if(len==0){
            return str.charAt(0)+"";
        }
        return str.charAt(len)+reverseString(str,len-1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.next();

        System.out.println("Reverse of string : "+reverseString(str,str.length()-1));

        sc.close();
    }
}
