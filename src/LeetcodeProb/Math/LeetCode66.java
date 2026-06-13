package LeetcodeProb.Math;

import java.util.Arrays;

/*
    https://leetcode.com/problems/plus-one?envType=problem-list-v2&envId=math

    Complexity Analysis :

     1. Time Complexity: O(n) Where n is the number of elements (digits) in the array.
          -> Worst-Case Scenario (O(n))  : This happens when the array contains only nines (e.g., [9, 9, 9]).
                                           The loop has to traverse the entire array from right to left to turn every 9 into a 0.
                                           Afterward, creating the new array of size n + 1 takes linear time to allocate memory.
          -> Best-Case Scenario (O(1))   : This happens when the last digit is less than 9 (e.g., [1, 2, 3]).
                                           If the (digits[i] < 9) condition triggers on the very first iteration, increments the digit, and returns immediately.
          -> Average-Case Scenario (O(1)): Statistically, you will only carry over a '1' multiple times if you hit consecutive 9s. On average,
                                           the loop only runs a tiny, constant number of times before hitting a non-nine digit and returning.

    2. Space Complexity: O(n)
         ->  Auxiliary Space        : O(1)In nearly all cases, the operations are performed in-place directly modifying the original digits array.
                                      No extra data structures, collections, or recursion stacks are used.
        ->   Worst-Case Total Space : O(n) In the specific edge case where the number is entirely made of nines (e.g., [9, 9, 9] --> [1, 0, 0, 0]),
                                      the algorithm is forced to allocate a new array of size n + 1 (newDigits) to hold the result.
                                      Because this new allocation scales linearly with the size of the input, the absolute worst-case space complexity is O(n).
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

        // Normal +1 increment case without extra space utilization.
        System.out.println(Arrays.toString(leetcode66.plusOne(new int[]{1,2,3})));

        // Utilization of Extra Space.
        System.out.println(Arrays.toString(leetcode66.plusOne(new int[]{9,9,9})));

        // Overflow case of data type range boundary limits.
        System.out.print(Arrays.toString(leetcode66.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }
}
