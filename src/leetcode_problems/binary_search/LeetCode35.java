package leetcode_problems.binary_search;

/*
  LeetCode 35:  https://leetcode.com/problems/search-insert-position?envType=study-plan-v2&envId=binary-search
 */


public class LeetCode35 {

    // Solution LeetCode 35
    public int searchInsert(int[] nums, int target) {
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
    static void main() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 11;

        LeetCode35 leetCode35 = new LeetCode35();

        System.out.println(leetCode35.searchInsert(nums,target));
    }
}
