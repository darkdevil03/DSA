package LeetcodeProb.Recursion;

/*
    https://leetcode.com/problems/fibonacci-number?envType=problem-list-v2&envId=recursion
*/

public class LeetCode509 {

    // Classical Approach
    // Time Complexity : Golden ratio ; Space Complexity : O(n)
    public int fib(int n) {

        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return fib(n-1) + fib(n-2);
    }

    static void main(){
        LeetCode509 leetCode509 = new LeetCode509();
        System.out.println(leetCode509.fib(1));
    }
}
