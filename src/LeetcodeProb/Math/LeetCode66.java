package LeetcodeProb.Math;

import java.util.Arrays;

/*
    https://leetcode.com/problems/plus-one?envType=problem-list-v2&envId=math
*/

public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Move from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No more carry, we can safely return early
            }

            // If it was 9, it becomes 0, and the loop continues to carry the 1
            digits[i] = 0;
        }

        // If we exit the loop, it means all digits were 9 (e.g., [9, 9, 9] -> [0, 0, 0])
        // We need a new array of size n + 1, with the first element set to 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }

    static void main(){
        LeetCode66 leetcode66 = new LeetCode66();
        System.out.print(Arrays.toString(leetcode66.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }
}
