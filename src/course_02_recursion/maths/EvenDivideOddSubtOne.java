package course_02_recursion.maths;

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

     static void main() {
        int num=0;

        System.out.println(stepsToZero(num,0));
    }
}
