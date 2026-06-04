package LeetcodeProb.BitManipulation;

import java.util.Arrays;

public class LeetCode645 {

    public int[] findErrorNums(int[] nums) {
        long sum = 0;
        long squareSum = 0;
        long expectedSum = 0;
        long expectedSquareSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            squareSum += (long) nums[i] * nums[i];

            long actualNumber = i + 1;
            expectedSum += actualNumber;
            expectedSquareSum += actualNumber * actualNumber;
        }

        // diff1 = duplicate - missing
        long diff1 = sum - expectedSum;

        // diff2 = duplicate^2 - missing^2
        long diff2 = squareSum - expectedSquareSum;

        // sumOfNumbers = duplicate + missing
        long sumOfNumbers = diff2 / diff1;

        int duplicate = (int) (diff1 + sumOfNumbers) / 2;
        int missing = (int) (sumOfNumbers - duplicate);

        return new int[]{duplicate, missing};
    }


    static void main() {

        int[] nums = new int[] {1,2,2,4};
        LeetCode645 leetCode645 = new LeetCode645();
        System.out.println(Arrays.toString(leetCode645.findErrorNums(nums)));
    }
}
