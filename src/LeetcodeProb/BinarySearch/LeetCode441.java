package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/arranging-coins?envType=study-plan-v2&envId=binary-search
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
