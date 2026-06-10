package LeetcodeProb.Math;

public class LeetCode7 {
    public int reverse(int x) {
        long reversed = 0;

        while(x != 0){
            reversed = (reversed * 10) + (x % 10);
            x = x / 10;
        }

        // // Check if the final result sits outside 32-bit integer boundaries
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0 ;
        }

        return (int) reversed;
    }


    static void main(){
        LeetCode7 leetCode7 = new LeetCode7();
        // Positive input.
        System.out.println(leetCode7.reverse(12));
        // Negative input.
        System.out.println(leetCode7.reverse(-12));
        // Integer of int type boundary check.
        System.out.println(leetCode7.reverse(1534236469));

    }
}
