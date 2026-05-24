package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/search-in-rotated-sorted-array?envType=study-plan-v2&envId=binary-search
*/

public class LeetCode33 {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;


        while ( start <= end ){

            int mid = start + ((end - start)/2);

            if(target == nums[mid]){
                return mid;
            }
            // Step 1: Check if the LEFT half is sorted
            if (nums[start] <= nums[mid]) {
                // Step 2: Check if target lies within this sorted LEFT half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Narrow down to the left
                } else {
                    start = mid + 1; // Otherwise, look in the right half
                }
            }
            // Step 1 Check: If the left isn't sorted, the RIGHT half must be sorted
            else {
                // Step 2: Check if target lies within this sorted RIGHT half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Narrow down to the right
                } else {
                    end = mid - 1; // Otherwise, look in the left half
                }
            }

        }

        return -1;

    }


    static void main() {

        // Taken one public case here
        int[] nums = {6,7,0,1,2,3,4,5};

        LeetCode33 leetCode33 = new LeetCode33();

        System.out.println(leetCode33.search(nums,0) );
    }
}
