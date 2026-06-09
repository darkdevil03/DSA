package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/palindrome-number?envType=problem-list-v2&envId=math
*/
public class LeetCode9 {

    public boolean isPalindrome(int x) {

        String str = ""+x;
        int j = str.length() ;
        for(int i = 0;i<=(j/2);i++){
            if(str.charAt(i) !=  str.charAt(j-i-1)){
                return false;
            }
        }

        return true;
    }

    static void main(){
        LeetCode9 leetCode9 = new LeetCode9();
        System.out.println(leetCode9.isPalindrome(-121));
    }
}
