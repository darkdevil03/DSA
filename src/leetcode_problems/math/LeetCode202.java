package leetcode_problems.math;

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

    public boolean isHappy(int n) {
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

    static void main(){
        LeetCode202 leetCode202 = new LeetCode202();
        System.out.println(leetCode202.isHappy(19));
        System.out.println(leetCode202.isHappy(2));
        System.out.println(leetCode202.isHappy(7));
    }
}
