package leetcode_problems.strings;

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
