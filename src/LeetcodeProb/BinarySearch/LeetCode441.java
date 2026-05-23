package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/arranging-coins?envType=study-plan-v2&envId=binary-search

    Explanation:

        Since the number of complete rows k will be somewhere between 1 and n, and the function (k * (k + 1))/2) is strictly increasing by +1,
        we can use Binary Search to find the correct k.

       1. How to Identify the Pattern

            The problem states: "the i-th row has exactly i coins." If we write down how many coins are required as we build each row,
            it looks like a simple list of counts:
                Row 1 = 1 coin
                Row 2 = 2 coins
                Row 3 = 3 coins
                Row 4 = 4 coins
                ...
                Row k = k coins

            If we want to know the total number of coins used to build a completely full staircase of k rows, we have to add these rows together:
                Total Coins = 1 + 2 + 3 + 4 + ... + k
            This sequence (1, 2, 3, 4...) is a textbook Arithmetic Progression because the number of coins increases by exactly the same amount (+1) for every single row.


      2. Why We Use the Formula: [k * (k + 1)] / 2

            Instead of adding the numbers one by one (like 1+2+3+4...), we use a famous algebraic shortcut called Gauss's Formula for the sum of the first k integers.
            Here is the intuition behind why it works. Imagine trying to find the sum of numbers from 1 to 4:
                1 + 2 + 3 + 4
            If you pair the numbers from the outside moving inward, a pattern emerges:
                Pair the first and last numbers: 1 + 4 = 5
                Pair the middle numbers: 2 + 3 = 5
            Every pair adds up to the exact same value!
                The value of each pair is always (k + 1) (in this case, 4 + 1 = 5).
                The total number of pairs we can make is always k / 2 (in this case, 4 / 2 = 2 pairs).
            Multiplying the number of pairs by the value of each pair gives us the total sum:
                Total Sum = Number of Pairs * Value of each Pair
                Total Sum = (k / 2) * (k + 1) = [k * (k + 1)] / 2


      3. Tracing and Connecting to the Formula (k * (k + 1))/2) with an example:

            Instead of subtracting step-by-step (which is too slow for large numbers), we use the math formula.
            For Example 2 (n = 8), if we guess that we can make k = 3 rows, we plug it into the formula:
                Total Coins = [3 * (3 + 1)] / 2 = 12 / 2 = 6 coins
            Since 6 is less than or equal to 8, 3 rows are definitely complete.
            If we try k = 4 rows:
                Total Coins = [4 * (4 + 1)] / 2 = 20 / 2 = 10 coins
            Since 10 is greater than 8, we don't have enough coins to complete 4 rows. Therefore, the maximum number of complete rows is 3.

            So, the guessing will be done by binary search middle value evaluation.

*/

public class LeetCode441 {

    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while(start <= (end)){
            long mid = start + ((end-start)/2); // guess generation value
            long coinUsed = mid * (mid + 1) /2;

            if(coinUsed == n){
                return (int) mid;
            }else if(coinUsed < n){
                start = mid + 1;  // Trying the possible for more rows
            }else{
                end = mid - 1;   // Too many coins, reduce rows
            }
        }

        // 'end' will point to the maximum number of complete rows
        return (int) end;

    }

    public static void main(String[] args) {

        LeetCode441 leetCode441 = new LeetCode441();

        int num = 5;

        System.out.println(leetCode441.arrangeCoins(num));
    }
}
