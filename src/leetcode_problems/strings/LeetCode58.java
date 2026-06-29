package leetcode_problems.strings;

/*
    https://leetcode.com/problems/length-of-last-word?envType=problem-list-v2&envId=string

    Complexity Analysis:

    Approach 1: Using String method trim()
        Time Complexity: O(N), where N is the length of the string s.
            -> The s.trim() method scans the entire string to remove leading and trailing spaces, which takes O(N) time.
            -> The while loop only runs for the length of the last word, which is O(K) (where K is the length of the last word, K <= N).
            -> Total Time: O(N) + O(K) = O(N).
        Space Complexity: O(N)
            -> s.trim() creates and returns a new string object in memory. In the worst-case scenario (e.g., no leading/trailing spaces),
               this new string is virtually the same size as the original, requiring extra memory proportional to N.

    Approach 2: Without using String method trim()
        Time Complexity: O(N)
            -> In the worst case (e.g., a string full of spaces or containing just one long word), we iterate through the string once from right to left.
        Space Complexity: O(1) (Constant Space)
            -> Unlike trim(), this approach uses only a couple of primitive integer variables (i and length).
               No new strings or memory allocations are created, making it highly efficient.
*/

public class LeetCode58 {
    // Helper function : Count characters of the last word (To reduce the repetitive same logic of both approaches)
    private int getCountLastWordChars(String trimmedStr,int length) {
        int lastWordCharCount = 0;
        while((length >= 0) && (trimmedStr.charAt(length) != ' ')){
            lastWordCharCount++;
            length--;
        }

        return lastWordCharCount;
    }

    // Approach 1: using trim() method
    public int lengthOfLastWordApproach1(String s) {
        // Step 1: Skip trailing spaces
        String trimmedStr = s.trim();

        int length = trimmedStr.length() - 1;

        // Step 2: Count characters of the last word
        return getCountLastWordChars(trimmedStr, length);
    }

    // Approach 2: without trim() method
    public int lengthOfLastWordApproach2(String s) {
        int i = s.length() - 1;

        // Step 1: Skip trailing from last spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters of the last word
        return getCountLastWordChars(s, i);
    }

    static void main(){
        LeetCode58 leetcode58 = new LeetCode58();

        System.out.println(leetcode58.lengthOfLastWordApproach1("Hello World"));
        System.out.println(leetcode58.lengthOfLastWordApproach2("Hello World"));

        System.out.println(leetcode58.lengthOfLastWordApproach1(" "));
        System.out.println(leetcode58.lengthOfLastWordApproach2(" "));

        System.out.println(leetcode58.lengthOfLastWordApproach1("a"));
        System.out.println(leetcode58.lengthOfLastWordApproach2("a"));
    }
}
