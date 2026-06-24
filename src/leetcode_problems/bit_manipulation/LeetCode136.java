package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/single-number?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int val = 0;

        for(int i : nums){
            val = val ^ i;
        }

        return val;
    }

    static void main(){
        LeetCode136 leetCode136 = new LeetCode136();

        int[] numsArr = new int[]{2,2,1};
        System.out.println(leetCode136.singleNumber(numsArr));
    }
}
