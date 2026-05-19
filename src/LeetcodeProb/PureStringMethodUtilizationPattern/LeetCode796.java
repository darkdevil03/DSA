package LeetcodeProb.PureStringMethodUtilizationPattern;

/*
Daily Question
    LeetCode 796 : https://leetcode.com/problems/rotate-string?envType=daily-question&envId=2026-05-03
*/

public class LeetCode796 {
    static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        int sLen = s.length();
        int goalLen = goal.length();

        int nonMatchIndexOf_S = 0;

        // substring() : https://www.w3schools.com/java/ref_string_substring.asp

        for(int i = 1; i <= sLen; i++){
            if( (s.substring(nonMatchIndexOf_S , i) ).equals(goal.substring(goalLen - i , goalLen)) ){
                nonMatchIndexOf_S = i;
            }
        }

        return ( (s.substring(nonMatchIndexOf_S) ).equals(goal.substring(0, (goalLen-nonMatchIndexOf_S))) ) ;

    }

    public static void main(String[] args) {

        // Taken one public case here
        String given_s= "abcde";
        String given_goal= "cdeab";

        System.out.println(rotateString(given_s,given_goal) );
    }
}
