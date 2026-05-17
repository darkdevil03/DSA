package LeetcodeProb;

/*
    https://leetcode.com/problems/find-minimum-in-rotated-sorted-array?envType=daily-question&envId=2026-05-15
*/

public class LeetCode153 {

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if(nums[0] < nums[end]) {
            return nums[0];
        }

        while(start < end){

            int mid = start + ((end - start)/2);

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}
