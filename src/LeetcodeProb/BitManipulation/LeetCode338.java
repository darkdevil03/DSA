package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/counting-bits?envType=problem-list-v2&envId=bit-manipulation
*/

import java.util.Arrays;

public class LeetCode338 {

    // Brute Force approach - 1 : Time complexity = O(n log n)
    public int[] countBits(int n) {

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

    static void main(){
        LeetCode338 leetCode338 = new LeetCode338();

        int n = 2;

        System.out.println(Arrays.toString(leetCode338.countBits(n)));

    }
}
