package leetcode_problems.math;

/*
    https://leetcode.com/problems/divide-two-integers?envType=problem-list-v2&envId=math
*/

public class LeetCode29 {
    public int divide(int dividend, int divisor) {

        // Return 2147483647 to handle the overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return (dividend/divisor);
    }

    static void main(){
        LeetCode29 leetCode29 = new LeetCode29();
        System.out.println(leetCode29.divide(10, 10));
    }
}
