package LeetcodeProb.Math;
import java.util.*;
/*
    https://leetcode.com/problems/roman-to-integer?envType=problem-list-v2&envId=math
*/

public class LeetCode13 {

    public int romanToInt(String s) {

        HashMap<Character, Integer> values = new HashMap<>();

        values.put('I',1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int ans = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            int currentVal = values.get(s.charAt(i));
            // 2. Look ahead: If the next Roman numeral is larger than the current one,
            // it means we need to subtract the current value instead of adding it.
            if (i + 1 < len && values.get(s.charAt(i + 1)) > currentVal) {
                ans -= currentVal;
            } else {
                ans += currentVal;
            }
        }

        return ans;
    }

    static void main(){
        LeetCode13 leetCode13 = new LeetCode13();
        System.out.println(leetCode13.romanToInt("III"));
    }
}
