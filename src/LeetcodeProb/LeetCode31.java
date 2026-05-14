package LeetcodeProb;

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



*/

import java.util.Arrays;

public class LeetCode31 {

    // Approach 1:
    static int[] searchRange(int[] nums, int target) {
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

    // main for input checks
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 3, 3, 3, 10, 12};
        int target = 3;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
}
