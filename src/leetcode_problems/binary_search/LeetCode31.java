package leetcode_problems.binary_search;

/*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array?envType=study-plan-v2&envId=binary-search

As per leetcode complier and given Constraints: both run in 0ms

    Approach 1: Hybrid (Binary search (target Checks)+ loops for walk left and right

        Logic: Use Binary Search to find any instance of the target, then use while loops to "walk" left and right to find the boundaries.

        Time Complexity: * Average/Best Case: O(log n). If the target appears only a few times,
                       the walk is short.Worst Case: $O(n)$. If the array is [8, 8, 8, 8, 8] and the target is 8,
                       the binary search finds the middle, but the while loops then visit every single element in the array.

        Space Complexity: O(1). You only store a few integers (low, high, mid, start, end).

      Advantages:Simplicity: The logic is very intuitive and easy to write.Speed for small ranges:
                             If you know the target only appears 2–3 times, this is practically as fast as any other method.

      Disadvantages:Performance Unpredictability: It fails the O(log n) requirement usually requested in interviews for this specific problem because of the linear "walk."

    Approach 2: Pure Binary Search

            Logic: Run Binary Search twice. Once to find the leftmost boundary, and once to find the rightmost boundary.

            Time Complexity: * All Cases: O(log n). Whether the target appears once or a million times, you are always halving the search space.

            Space Complexity: O(1). No extra arrays or recursion are used.

        Advantages: Guaranteed Performance: It satisfies the O(log n) constraint perfectly.
                   It is the "Gold Standard" for this problem. Reliability: Large datasets do not slow this down.

        Disadvantages: Slightly more complex: Requires writing a helper function or repeating the binary search logic with a small modification.

*/

import java.util.Arrays;

public class LeetCode31 {

    // Approach 1: Hybrid Approach
    public int[] searchRangeApproach1(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        int[] result={-1,-1};

        while(low<=high){

            int mid = low + ((high-low)/2);

            if(target==nums[mid]){
                int start=mid;
                int end=mid;

                // Expand left to find the first occurrence
                while ((start>0) && (nums[start-1]==target)){
                    start--;

                }

                // Expand right to find the last occurrence
                while ((end<(nums.length-1)) && (nums[end+1]==target)){
                    end++;
                }
                result[0]=start;
                result[1]=end;
                break;
            }

            if(target > nums[mid]){
                low=mid+1;
            }

            if(target < nums[mid]){
                high=mid-1;
            }
        }

        return result;

    }


    // Approach 2: Dual Binary Search
    public int numSearch(int[] nums, int target, boolean isFirstSearch){

        int low = 0;
        int high = nums.length-1;
        int bound=-1;

        while(low<=high){

            int mid = low + ((high-low)/2);

            if(target==nums[mid]){

                bound=mid;

                // Expand left to find the first occurrence
                if (isFirstSearch){
                    high=mid-1;

                }
                // Expand right to find the last occurrence
                else{
                    low=mid+1;
                }
            } else if(target > nums[mid]){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }

        return bound;
    }

    public int[] searchRangeApproach2(int[] nums, int target) {

        int[] result = {-1, -1};

        result[0] = numSearch(nums, target, true);

        if (result[0] != -1) {
            result[1] = numSearch(nums, target, false);
        }

        return result;
    }

    // main for input checks
    static void main() {
        int[] nums = {-1, 0, 1, 3, 3, 3, 10, 12};
        int target = 3;

        LeetCode31 leetCode31 = new LeetCode31();

        System.out.println(Arrays.toString(leetCode31.searchRangeApproach1(nums, target)));

        System.out.println(Arrays.toString(leetCode31.searchRangeApproach2(nums, target)));

    }
}
