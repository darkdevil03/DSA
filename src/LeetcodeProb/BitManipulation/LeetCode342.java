package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/power-of-four?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode342 {

    // Approach 1 :
    public boolean isPowerOfFourApproach1(int n) {
        if(n == 1){
            return true;
        }

        while((n > 1) && (n % 4 == 0)){

            if(n == 4){
                return true;
            }

            n = n >> 2;
        }

        return false;

    }

    // Optimized Approach :
    public boolean isPowerOfFourApproach2(int n) {
        // n > 0: Must be positive
        // (n & (n - 1)) == 0: Must have exactly one bit set (power of two)
        // (n & 0x55555555) != 0: That bit must be at an even index / odd position
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    static void main() {

        int num = 16;

        LeetCode342 leetCode342 = new LeetCode342();

        System.out.println(leetCode342.isPowerOfFourApproach1(num));

        System.out.println(leetCode342.isPowerOfFourApproach2(num));
    }
}
