package leetcode_problems.math;

public class LeetCode233 {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;

        long count = 0;
        // Use long to prevent integer overflow when multiplying factor by 10
        for (long factor = 1; factor <= n; factor *= 10) {
            long higher = n / (factor * 10);
            long curr = (n / factor) % 10;
            long lower = n % factor;

            if (curr == 0) {
                count += higher * factor;
            } else if (curr == 1) {
                count += higher * factor + lower + 1;
            } else {
                count += (higher + 1) * factor;
            }
        }

        return (int) count;
    }

    static void main() {
        LeetCode233 leetcode233 = new LeetCode233();
        System.out.println(leetcode233.countDigitOne(13));
    }
}
