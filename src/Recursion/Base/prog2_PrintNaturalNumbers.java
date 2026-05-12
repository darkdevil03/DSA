package Recursion.Base;

public class prog2_PrintNaturalNumbers {

    static void printNumber(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        printNumber(num-1);

        System.out.println(num);
    }

    public static void main(String[] args) {
        printNumber(5);
    }
}
