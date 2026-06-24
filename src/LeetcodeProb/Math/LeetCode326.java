package LeetcodeProb.Math;

public class LeetCode326 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;

        while(n % 3 == 0){
            n = n / 3;
        }

        return n == 1;
    }

    static void main(){
        LeetCode326 leetCode326 = new LeetCode326();
        System.out.println(leetCode326.isPowerOfThree(6));
        System.out.println(leetCode326.isPowerOfThree(27));
    }
}
