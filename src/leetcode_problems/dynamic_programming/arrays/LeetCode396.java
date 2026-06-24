package leetcode_problems.dynamic_programming.arrays;

/*
    https://leetcode.com/problems/rotate-function?envType=daily-question&envId=2026-05-03
*/

public class LeetCode396 {

    public int maxRotateFunction(int[] nums) {

        int len = nums.length ;

        if(len <= 1)
            return 0;

        long sum = 0;
        long f = 0;

        // 1. Compute total array sum (S) and initial F(0)
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long maxSum = f;

        // 2. Derive F(k) from F(k-1) in O(1) time per step  :
        // Recurrance Relation : F(k) = F(k-1) + S - N * (nums[N-i]) ; Here, N is len
        for (int i = 1; i < len ; i++) {
            f = f + sum - (long) (len) * nums[len-i];
            if (f > maxSum) {
                maxSum = f;
            }
        }

        return (int) maxSum;

    }

    static void main() {
        int[] nums = {4,3,2,6};

        LeetCode396 leetCode396 = new LeetCode396();

        System.out.println(leetCode396.maxRotateFunction(nums));
    }

}
