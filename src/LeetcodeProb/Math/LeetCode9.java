package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/palindrome-number?envType=problem-list-v2&envId=math

    Approach-1 : Using string conversion

        Time Complexity  : O(n) where n is the number of digits.

        Space Complexity : O(n) auxiliary space.

    Approach-2 : Using math

        Time Complexity  : O(log(n)) where n is the value of the number.

        Space Complexity : O(1) auxiliary space (Constant Space).

*/
public class LeetCode9 {

    // Approach-1 : Converts the integer to a String :
    public boolean isPalindrome1(int x) {

        String str = ""+x;  // extra space

        int j = str.length() ;

        for(int i = 0 ;i <= ( j / 2 ); i++){  // loop over half-string (n/2).
            if(str.charAt(i) !=  str.charAt(j - i - 1))
                return false;
        }
        /*
            Notice the relationship: when the number of digits (n) doubles, the number of loop iterations also doubles.
            Because the growth rate scales perfectly linearly with n, mathematically we write it as:
            O(n/2) => ((1/2) * n) => O(n). ; (implies :  =>)
         */

        return true;

    }

    // Approach-2 : Optimized approach using Math operations :
    public boolean isPalindrome2(int x){
        /* Special cases:
           As discussed, negative numbers are not palindromes (e.g., -121)
           Also, if the last digit of the number is 0, for it to be a palindrome,
           the first digit also needs to be 0. Only 0 itself satisfies this. */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Reversing the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        /* When the length is an odd number, we can get rid of the middle digit by reversedHalf/10
           For example, when x = 12321, at the end of the while loop we get x = 12, reversedHalf = 123
           Since the middle digit doesn't matter in palindrome, we can safely divide it by 10. */
        return x == reversedHalf || x == reversedHalf / 10;

    }

    static void main(){
        LeetCode9 leetCode9 = new LeetCode9();

        System.out.println("Using approach-1 : "+leetCode9.isPalindrome1(-121));

        System.out.println("Using approach-2 : "+leetCode9.isPalindrome2(-121));

    }
}
