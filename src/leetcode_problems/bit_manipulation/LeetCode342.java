package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/power-of-four?envType=problem-list-v2&envId=bit-manipulation

    Approach 1: using loop
      --> Time Complexity: O(log n / log 4) - The while loop executes repeatedly, dividing the number by 4 on each cycle until it drops to 1 or fails.
                           For large integers, it can run up to 16 times.

      --> Space Complexity: O(1) - Only updates the variable n in-place without setting aside auxiliary memory structures.

    Approach 2: using without loop or recursion - optimized
      --> Time Complexity: O(1) - Performs exactly 3 instant bitwise logic operations in a single CPU cycle, regardless of how large n is.

      --> Space Complexity: O(1) - Uses zero allocations, working purely inside standard CPU registers.

*/

public class LeetCode342 {

    // Approach 1 : using loop
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

    // Approach 2 : without using loops / recursions
    public boolean isPowerOfFourApproach2(int n) {
        // n > 0: Must be positive
        // (n & (n - 1)) == 0: Must have exactly one bit set (power of two)
        // Modulo 3 check ensures it's an even power of 2 (hence, a power of 4)
        return ( n > 0 && (n & (n - 1)) == 0 && (n & 3) == 1);
    }

    static void main() {

        int num = 8;

        LeetCode342 leetCode342 = new LeetCode342();

        System.out.println(leetCode342.isPowerOfFourApproach1(num));

        System.out.println(leetCode342.isPowerOfFourApproach2(num));
    }
}
