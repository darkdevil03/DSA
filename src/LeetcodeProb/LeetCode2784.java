package LeetcodeProb;

/*
Daily Question
    LeetCode2784 : https://leetcode.com/problems/check-if-array-is-good?envType=daily-question&envId=2026-05-14

   |     Approaches   |       1         |       2       |        3       |
   |---------------------------------------------------------------------|
   | Time Complexity  |     O(N)        |     O(N+K)    |     O(NLogN)   |
   |---------------------------------------------------------------------|
   | Space Complexity |     O(1)        |      O(1)     |     O(LogN)    |
*/

import java.util.Arrays;

public class LeetCode2784 {

        // Approach 1: Cycle Sort

            static boolean isGoodApproach1(int[] nums) {
                int len = nums.length;
                int n = len - 1;

                if (len < 2)
                    return false;

                int i = 0;

                while (i < len) {                       // O(N)

                    int balanceIndex = nums[i] - 1;

                    if (nums[i] < len && nums[i] != nums[balanceIndex]) {
                        int temp = nums[i];
                        nums[i] = nums[balanceIndex];
                        nums[balanceIndex] = temp;
                    } else {
                        i++;
                    }

                }

                for (int j = 0; j < n; j++) {           // O(N-1)
                        if (nums[j] != (j + 1)) {
                            return false;
                        }
                    }
                                                        // O(N) + O(N-1) = O(N)
                return (nums[n] == n);
            }


      //Approach 2: Count Sort
            static boolean isGoodApproach2 ( int[] nums){
                int len = nums.length;

                int base = len - 1;

                if (len < 2)
                    return false;

                int[] track = new int[201];   // O(1) is because of independent from the input array

                for (int i = 0; i < len; i++) {             // O(N)
                    if (nums[i] > base) {
                        return false;
                    }
                    track[nums[i]] = track[nums[i]] + 1;
                }

                for (int i = 1; i < base; i++) {            // O(N-1)
                    if (track[i] != 1)
                        return false;
                }
                                                            // O(N) + O(N-1) = O(N)
                return (track[base] == 2);
            }


    //Approach 3: Arrays Sort + Permutations Checks
            static boolean isGoodApproach3 ( int[] nums){

                Arrays.sort(nums);                      // N log(N)

                int base = nums.length - 1;
                for (int i = 0; i < base; i++) {        // O(N-1)
                    if (nums[i] != (i + 1)) {
                        return false;
                    }
                }
                                                        // O(N log(N)) + O(N-1) = O(N Log N)
                return (nums[base] == base) && (nums[base - 1] == base);
            }


            // Main
            public static void main (String[]args){

                int[] nums = {1, 3, 3, 2};

                System.out.println(isGoodApproach1(nums));
                System.out.println(isGoodApproach2(nums));
                System.out.println(isGoodApproach3(nums));

            }
        }
