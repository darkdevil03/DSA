package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/number-complement?envType=problem-list-v2&envId=bit-manipulation

    Approach 1 :
     Time Complexity : O(log_2(num)) because the length of the string is directly proportional to the number of bits in num.
                       For a 32-bit integer, it loops up to 31 times.

     Space Complexity: O(log_2(num)) auxiliary space to store the string representations in memory.


     Approach 2 :
     Time Complexity : O(1) constant time. Methods like Integer.highestOneBit() utilize native intrinsic CPU instructions
                       (like CLZ - Count Leading Zeros), which run in a single clock cycle regardless of how large num is.
                       Even the shifting alternative executes exactly 5 bitwise OR lines every single time.

     Space Complexity: O(1) auxiliary space. Only a single primitive integer (mask) is utilized on the execution stack.

*/

public class LeetCode476 {

    // Using StringBuilder as Extra Space ; Bruteforce
    public int findComplementApproach1(int num) {

        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));

        for(int i = 0; i < sb.length() ;i++){
            if(sb.charAt(i) == '1') {
                sb.setCharAt(i,'0');
            } else{
                sb.setCharAt(i,'1');
            }
        }

        return Integer.parseInt(sb.toString(),2);
    }

    // Optimized Approach
    public int findComplementApproach2(int num) {

        // Find the number of bits in the highest power of 2 for num
        // e.g., for 5 (101), highestOneBit is 4 (100). Shifting left by 1 and subtracting 1 gives 7 (111).
        int mask = (Integer.highestOneBit(num) << 1) - 1;

        // Handle overflow case if num uses the 31st bit
        if (num >= Integer.highestOneBit(num) && Integer.highestOneBit(num) == (1 << 30)) {
            mask = Integer.MAX_VALUE;
        }

        return num ^ mask;

    }

    static void main(){
        LeetCode476 leetCode476 = new LeetCode476();

        int num = 5;
        System.out.println("Before Complement of "+ num +" : "+Integer.toBinaryString(5));

        int resultOfApproach1 = leetCode476.findComplementApproach1(num);
        int resultOfApproach2 = leetCode476.findComplementApproach2(num);

        System.out.println("After Complement of "+ num +" using approach-1 : "+Integer.toBinaryString(resultOfApproach1));
        System.out.println("After Complement of "+ num +" using approach-2 : "+Integer.toBinaryString(resultOfApproach2));

    }

}
