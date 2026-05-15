package LeetcodeProb;

/*
Daily Question
    LeetCode2784 : https://leetcode.com/problems/check-if-array-is-good?envType=daily-question&envId=2026-05-14
 */

import java.util.Arrays;

public class LeetCode2784 {

    // Solution
    static boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int base = nums.length-1;
        for(int i=0;i<base;i++){
            if(nums[i]!=(i+1)){
                return false;
            }

        }
        for(int i=0;i<=base;i++)
            if(nums[base]==base){
                if(nums[base-1]==base){
                    return true;
                }
            }



        return false;
    }

    // Main
    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 2};

        System.out.println(isGood(nums));

    }
}
