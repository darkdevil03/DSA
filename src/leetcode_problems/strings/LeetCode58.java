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
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        int length = trimmedStr.length();

        int count = 0;
        while((length>0) && (trimmedStr.charAt(length-1)!=' ')){
            count++;
            length--;
        }

        return count;
    }

    static void main(){
        LeetCode58 leetcode58 = new LeetCode58();
        System.out.println(leetcode58.lengthOfLastWord("Hello World"));
        System.out.println(leetcode58.lengthOfLastWord(" "));
        System.out.println(leetcode58.lengthOfLastWord("a"));
    }
}
