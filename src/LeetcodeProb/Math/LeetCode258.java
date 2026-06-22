package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/add-digits?envType=problem-list-v2&envId=math

    Complexity Analysis:

      Time Complexity :
            Approach 1: O(log_(10) n)
                        It uses num % 10 and num /= 10 to process a number digit by digit.
                        The number of digits in any integer n is given by floor of [log_(10) n ]+ 1.
                        The Outer Cycles: When the inner loop finishes a pass and reduces a large number
                        (e.g., 38 -> 11), it triggers another pass (11 -> 2).
                        However, because each pass rapidly decreases the size of the number exponentially,
                        the total operations remain tightly bounded by the number of digits in the original input.
                        For a 32-bit integer (up to 2 * 10^9 times), this loop executes at most a few dozen times.


            Approach 2: O(1)
                        It relies entirely on the digital root property using the formula 1 + (num - 1) % 9.
                        Hardware Efficiency: No matter how large the integer is (even approaching the constraint limit of 2^31 - 1),
                        the CPU performs a fixed number of basic machine operations (one subtraction, one modulo, and one addition).
                        There are zero branches or repeating cycles, making it execute in execution constant time.

        Space Complexity:
            Both solutions achieve a perfect O(1) Auxiliary Space complexity.
            Approach 1: tracks the state using only a single primitive variable (int sum).
            Approach 2: The mathematical approach evaluates the expression in-place without allocating any extra memory or stack frames (since it avoids recursion).
 */

public class LeetCode258 {

    // Loop based approach
    public int addDigitsApproach1(int num) {
        int sum = 0;

        while(num > 0){
            sum = sum + (num % 10);
            num /=10;
            if((num == 0) && (sum > 9)){
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }

    // Optimized : Single modulo arithmetic operation approach
    public int addDigitsApproach2(int num) {

        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;

        return num % 9;
    }

    // A single mathematical formula
    public int addDigitsApproach3(int num) {
        return 1 + ((num - 1) % 9);
    }

    // Main method
    static void main() {
        LeetCode258 leetCode258 = new LeetCode258();
        System.out.println(leetCode258.addDigitsApproach1(38));
        System.out.println(leetCode258.addDigitsApproach2(38));
        System.out.println(leetCode258.addDigitsApproach3(38));
    }
}
