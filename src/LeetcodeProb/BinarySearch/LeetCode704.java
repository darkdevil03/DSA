package LeetcodeProb.BinarySearch;
/*
    Leetcode 704: https://leetcode.com/problems/binary-search?envType=study-plan-v2&envId=binary-search
*/

public class LeetCode704 {

    // Solution method
    static int search(int[] nums, int target) {

        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + ((end-start) / 2); // Prevents potential overflow

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

        return -1;

    }

    // main for input checks
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums,target));
    }
}
