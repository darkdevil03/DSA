package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/valid-perfect-square?envType=study-plan-v2&envId=binary-search
*/

public class LeetCode367 {

    public boolean isPerfectSquare(int num) {

        if(num == 1)
            return true;

        long start = 2;
        long end = num;

        while(start <= (end)){
            long mid = start + ((end -start)/2);

            if( mid * mid == num){
                return true;
            }else if(mid * mid < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return false;
    }

    static void main() {
        int num = 16;

        LeetCode367 leetCode367 = new LeetCode367();

        System.out.println(leetCode367.isPerfectSquare(num));
    }
}
