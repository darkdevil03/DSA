package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/power-of-three?envType=problem-list-v2&envId=math

    Complexity Analysis
        Time Complexity : O(log_(3) n)
        Space Complexity: O(1)
 */

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
