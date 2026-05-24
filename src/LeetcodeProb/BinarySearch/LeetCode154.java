package LeetcodeProb.BinarySearch;

/*
Daily Question
    LeetCode 154 : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii?envType=daily-question&envId=2026-05-16
*/


public class LeetCode154 {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end ){

            int mid = start + ((end - start)/2);

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }
            else{
                // // When nums[mid] == nums[end], we can't determine the side.
                // Simply decrement end to skip the duplicate.
                end--;
            }
        }

        return nums[start];
    }

    static void main() {

        int[] nums = {3,3,3,1,3,3,3,3,3,3};

        LeetCode154 leetCode154 = new LeetCode154();

        System.out.println(leetCode154.findMin(nums));
    }

}
