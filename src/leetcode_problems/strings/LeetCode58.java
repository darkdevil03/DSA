package leetcode_problems.strings;

/*

    Complexity Analysis:

    Approach 1: Using String method trim()
        Time Complexity: O(N), where N is the length of the string s.
            -> The s.trim() method scans the entire string to remove leading and trailing spaces, which takes O(N) time.
            -> The while loop only runs for the length of the last word, which is O(K) (where K is the length of the last word, K <= N).
            -> Total Time: O(N) + O(K) = O(N).
        Space Complexity: O(N)
            -> s.trim() creates and returns a new string object in memory. In the worst-case scenario (e.g., no leading/trailing spaces),
               this new string is virtually the same size as the original, requiring extra memory proportional to N.
*/

public class LeetCode58 {
    // Approach 1: using trim() method
    public int lengthOfLastWordApproach1(String s) {
        // Step 1: Skip trailing spaces
        String trimmedStr = s.trim();

        int length = trimmedStr.length() - 1;
        int lastWordCharCount = 0;

        // Step 2: Count characters of the last word
        while((length >= 0) && (trimmedStr.charAt(length) != ' ')){
            lastWordCharCount++;
            length--;
        }

        return lastWordCharCount;
    }

    // Approach 2: without trim() method
    public int lengthOfLastWordApproach2(String s) {
        int lastWordCharCount = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing from last spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            lastWordCharCount++;
            i--;
        }

        return lastWordCharCount;
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
