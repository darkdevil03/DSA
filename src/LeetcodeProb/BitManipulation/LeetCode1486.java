package LeetcodeProb.BitManipulation;
/*
    https://leetcode.com/problems/xor-operation-in-an-array?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode1486 {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++ ){
            nums[i] = start + ( 2 * i);
            sum = sum ^ nums[i];
        }

        return sum;
    }

    static void main(){
        LeetCode1486 leetCode1486 = new LeetCode1486();
        System.out.println(leetCode1486.xorOperation(4,3));
    }
}
