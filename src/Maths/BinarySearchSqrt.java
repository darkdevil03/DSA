package Maths;

import java.util.Scanner;

public class BinarySearchSqrt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 4;
        System.out.printf("%.2f",bsSqrt(num,3));
    }

    static float bsSqrt(int num,int p) {
        int start = 0;
        int end = num;
        float deci = 0f;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("mid :"+mid);
            if (num == mid*mid){
                System.out.println("1");
                return mid;
            }
            if (num > mid*mid) {
                System.out.println("2");
                deci=mid;
                start = mid + 1;
            }
            if (num < mid*mid){
                end = mid - 1;
                deci=mid;
                System.out.println("3");
            }

        }


        float incr=0.1f;

        for (int i = 0; i <p; i++) {
            while(deci*deci<=num){
                deci+=incr;
                System.out.println("4 : "+"deci:"+deci);
            }
            deci-=incr;
            System.out.println("prev:"+deci);
            incr=incr/10;

        }
        return deci;
    }
}
