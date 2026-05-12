package LeetcodeProb;

public class EvenDivideOddSubtOne {

    static  int stepsToZero(int n,int steps){

        if(n%2==0 && n>0){
           return stepsToZero(n/2,steps+1);
        }
        if(n % 2 == 1){
           return stepsToZero((n-1),steps+1);
        }
        return steps;
    }

    public static void main(String[] args) {
        int num=0;
        System.out.println(stepsToZero(num,0));
    }
}
