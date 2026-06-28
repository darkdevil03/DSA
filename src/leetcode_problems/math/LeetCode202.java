package leetcode_problems.math;

/*
    https://leetcode.com/problems/happy-number?envType=problem-list-v2&envId=math

    Complexity Analysis:

    1. Two Pointers (Floyd's Tortoise and Hare):
            This approach tracks two runners moving at different speeds through the number generation chain to detect cycles without storing past numbers.
       Time Complexity: O(log n)
         -> Digit Square Sum Step: For any number x, finding the next number requires isolating each digit.
                                   The number of digits in x is proportional to log_{10}(x).
         -> Chain Length: In the worst-case scenario for a number n <= 2^{31} - 1,
                          the maximum possible value for the next step occurs at 1,999,999,999$,
                          which yields 1 + (9 * 9^2) = 730. Any value above 730 immediately drops below it within one step.
                          Once numbers drop into this small finite space (1 to 730),
                          they either hit 1 or get stuck in a static cycle within very few steps.
         -> Therefore, the total number of operations is bounded by a constant multiplied by the number of digits in the starting number,
                          scaling overall as $\mathcal{O}(\log n)$.
       Space Complexity: O(1)
         -> Only two pointer variables (slowRunner and fastRunner) are tracked sequentially.
            No historical data structures are created, making this approach extremely memory efficient.

    2. Using a Hash Set Approach:
            This approach caches every generated number into a lookup table until it hits 1 or detects a repeat value.
       Time Complexity: O(log n)
         -> The core math behaves identically to the Two Pointers approach. The series quickly drops into a small bounded range under 730.
            Checking and inserting items in a HashSet takes an average time complexity of O(1).
            Thus, the overall runtime scales strictly with the number of digits of the initial input, making it O(log n).
       Space Complexity: O(log n) (effectively bounded by O(1) practically)
         -> Strict Theoretical Bound: The total elements stored in the HashSet are proportional to the size of the chain lengths traversed.
         -> Practical Bound: Because any large integer collapses below 730 in a single step,
            the HashSet will never store more than a tiny handful of values (the longest cycle sequence for numbers in this range is less than 10 values long).
            While theoretically dependent on the input's path size, it behaves like O(1) auxiliary space in practical implementation.
*/

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {

    // Helper function to calculate the sum of squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }

    // 1. Two Pointers (Floyd's Tortoise and Hare) approach
    public boolean isHappyApproach1(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);

        // Move fast runner by 2 steps and slow runner by 1 step
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }

        // If fastRunner reached 1, it's a happy number
        return fastRunner == 1;
    }

    // 2. Using HashSet approach:
    public boolean isHappyApproach2(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }


    static void main(){
        LeetCode202 leetCode202 = new LeetCode202();

        System.out.println("isHappyApproach - 1 ");
        System.out.println(leetCode202.isHappyApproach1(19));
        System.out.println(leetCode202.isHappyApproach1(2));

        System.out.println("isHappyApproach - 2 ");
        System.out.println(leetCode202.isHappyApproach2(19));
        System.out.println(leetCode202.isHappyApproach2(2));

    }
}
