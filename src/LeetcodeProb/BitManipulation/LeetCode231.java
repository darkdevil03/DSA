package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/power-of-two?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode231 {

    public boolean isPowerOfTwo(int n) {

        return ( n > 0 && (n & (n-1)) == 0 );

    }

    static void main(){
        LeetCode231 leetCode231 = new LeetCode231();

        System.out.println(leetCode231.isPowerOfTwo(16));

        System.out.println(leetCode231.isPowerOfTwo(3));
    }

}
