package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/counting-bits?envType=problem-list-v2&envId=bit-manipulation
*/

import java.util.Arrays;

public class LeetCode338 {

    // Brute Force approach - 1 : Time complexity = O(n log n)
    public int[] countBitsBruteForceApproach(int n) {

        int[] ans = new int[n+1];

        for (int i = 1; i <= n ; i++){   // Outer loop: Runs exactly n times

            /* The count and val variable is constant while input grows also.
               So, Space Complexity: O(1) auxiliary space (excluding the output array ans as per the return type requirement)
               ,meaning it is optimally efficient.
            */
            int count = 0;
            int val = i;

            while(val > 0){             // Inner loop: Counts bits for the current number.
                count += (val & 1);
                val >>= 1;              // Divides val by 2 each step. So, log n times.
            }
            ans[i] = count;
        }

        return ans;
    }

    // DP with Bit Manipulation - 2: Time complexity
    /*
        Every number i can be derived from a smaller number by dropping its least significant bit.
        The relationship is straightforward : i >> 1 shifts the number to the right by 1 bit (effectively dividing it by 2).
        i & 1 tells us whether the last bit was a 1 (odd) or 0 (even).
        Thus, the number of set bits in i is exactly the number of set bits in i >> 1 plus 1 if i is odd (or 0 if $i$ is even).
     */
    public int[] countBitsDynamicProgrammingApproach(int n) {
        /*
            Space Complexity: O(1) auxiliary space (excluding the output array ans as per the return type requirement)
           ,meaning it is optimally efficient.
        */
        int[] ans = new int[n+1];

        for (int i = 0; i <= n ; i++){
            // ans[i >> 1] is the bit count of the shifted number
            // (i & 1) adds 1 if the current number is odd
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    // For printing 1 to n. For n to mapping number of set bits in it.
    int[] printNumbers(int range){
        int[]  numbers = new int[range+1];
        for (int i = 0; i <= range; i++){
            numbers[i] = i;
        }
        return numbers;
    }

    static void main(){
        LeetCode338 leetCode338 = new LeetCode338();

        int n = 10;

        // For mapping 1 to number for set bits count of each.
        System.out.println(Arrays.toString(leetCode338.printNumbers(n)));

        System.out.println(Arrays.toString(leetCode338.countBitsBruteForceApproach(n)));

        System.out.println(Arrays.toString(leetCode338.countBitsDynamicProgrammingApproach(n)));

    }
}
