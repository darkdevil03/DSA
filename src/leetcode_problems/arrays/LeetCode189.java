package leetcode_problems.arrays;

/*
    https://leetcode.com/problems/rotate-array
*/

import java.util.Arrays;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if(k == 0)
            return;

        int count = 0;
        for(int i = 0 ; count < len; i++ ){

            //int count = 0;
            int currentIndex = i;
            int preVal = nums[i];

            do{

                int nextIndex = (currentIndex + k) % len;

                int temp = nums[nextIndex];
                nums[nextIndex]= preVal;
                preVal = temp;

                currentIndex = nextIndex;
                count++;
            }while(i != currentIndex);
        }

        System.out.println(Arrays.toString(nums));

    }

    static void main(){
        LeetCode189 leetCode189 = new LeetCode189();
        leetCode189.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
