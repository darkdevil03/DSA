package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/reverse-bits?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode190 {

    // Approach-1 Optimized

    // Treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // 1. Shift result to the left to make room for the next bit
            result <<= 1;

            // 2. Isolate the last bit of n using bitwise AND (& 1)
            //    and add it to result using bitwise OR (|)
            result |= (n & 1);

            // 3. Shift n to the right to process the next bit
            // Must use unsigned right shift (>>>) to handle negative numbers properly
            // In case of negative numbers range >>> forced to make Left side value is to zero.
            n >>>= 1;  // Here, we can also use >> because input is positive integer and even
        }

        return result;
    }

// Approach 2
    /*
    Here in this approach-2 :  Converting the integer to a binary string, padding it, using StringBuilder.reverse(), and parsing it back.
    While this logic is perfectly correct, strings in Java carry huge overhead (object allocation, character copying, parsing. So, more run time
     */
    public int reverseBitsApproach2(int n) {  // only positive and even

        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        StringBuilder binaryStringBuilder = new StringBuilder(binary);

        return Integer.parseInt(binaryStringBuilder.reverse().toString(), 2);

    }

    static void main(){
        LeetCode190 leetCode190 = new LeetCode190();

        int n = 43261596;  // as per question n is strictly even

        System.out.println(leetCode190.reverseBits(n));

        System.out.println(leetCode190.reverseBitsApproach2(n));
    }
}
