package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/number-of-1-bits?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode191 {

    // Approach-1: Standard approach
    public int hammingWeight(int n) {
        int count = 0;

        while(n > 0){
            if((n & 1) == 1)
                count++;

            n = n >> 1;
        }

        return count;
    }

    // Approach-2: The Ultimate Optimization (Brian Kernighan's)
    public int hammingWeightApproach2(int n) {
        int count = 0;

        while(n != 0){
            n = n & (n-1);
            count++;
        }

        return count;
    }

    static void main(){
        LeetCode191 leetCode191 = new LeetCode191();
        int num = 128;

        System.out.println(leetCode191.hammingWeight(num));

        System.out.println(leetCode191.hammingWeightApproach2(num));
    }
}
