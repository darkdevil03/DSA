package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/missing-number?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode268 {
    public int missingNumber(int[] nums) {

        int res = 0;
        int res2 = 0;

        for (int i : nums){
            res = res ^ i;
        }
        for(int i=0 ; i <= nums.length; i++){
            res2 = res2 ^ i;
        }

        return res ^ res2;
    }

    static void main(){
        LeetCode268 leetCode268 = new LeetCode268();

        System.out.println(leetCode268.missingNumber(new int[]{3,0,1}));

        System.out.println(leetCode268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

        System.out.println(leetCode268.missingNumber(new int[]{0,1}));
    }
}
