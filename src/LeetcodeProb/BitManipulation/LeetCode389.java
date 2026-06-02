package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/find-the-difference?envType=problem-list-v2&envId=bit-manipulation

        Time Complexity : O(N) because we only traverse the strings once.

        Space Complexity: O(1) auxiliary space. Unlike using a Hash Map or an integer frequency array,
                           we aren't allocating any extra memory structures.
*/

public class LeetCode389 {

    public char findTheDifference(String s, String t) {
        // Start with the last character of t ; s.length() = t.length() - 1 always as per question.
        int length = s.length();
        char result = t.charAt(length);

        // XOR the rest of the characters together pair by pair
        for (int i = 0; i < length; i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }

        return result;
    }

    static void main() {
        LeetCode389 leetCode389 = new LeetCode389();

        String s = "abcd";
        String t = "bacde";

        System.out.println(leetCode389.findTheDifference(s, t));

    }
}
