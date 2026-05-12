package LeetcodeProb;

/*
  LeetCode 35:  https://leetcode.com/problems/search-insert-position?envType=study-plan-v2&envId=binary-search
 */


public class LeetCode35 {

    // Solution LeetCode 35
    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int mid=0;

        while(start<=end){
            mid = start + ((end-start) / 2); // Prevents potential overflow

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
        }

        if(nums[mid]>target)
            return mid;
        else
            return mid+1;
    }

    // main for input checks
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 11;

        System.out.println(searchInsert(nums,target));
    }
}
