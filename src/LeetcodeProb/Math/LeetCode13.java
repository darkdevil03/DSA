package LeetcodeProb.Math;

import java.util.*;

/*
    https://leetcode.com/problems/roman-to-integer?envType=problem-list-v2&envId=math

    Complexity Analysis

    Time Complexity : For both approaches, the overall time complexity is technically O(n), where n is the length of the string s.
                      Our loop runs exactly n times.Inside the loop, while your HashMap takes O(1) constant time on average to find a value,
                      its real-world execution clock cycles are much higher than the switch statement's literal O(1) assembly-level jump.
                      This is why yours clocks in at 4ms while the optimization hits 0ms.
                      (Note: Since the input string length for this specific problem on LeetCode is bounded to a maximum of 15 characters,
                      the execution time is practically O(1) in an absolute sense).

    Space Complexity:
                      Approach-1: O(1) Auxiliary Space. Although your code instantiates a HashMap,
                                  it only ever holds a fixed maximum of 7 key-value pairs (I, V, X, L, C, D, M).
                                  It does not grow relative to the size of the input string.
                                  However, it still burdens the heap memory by instantiating Java objects.
                      Approach-2: O(1) Auxiliary Space. It uses absolute zero heap allocations.
                                  It strictly utilizes a handful of primitive int data allocations directly on the execution stack,
                                  achieving the absolute lowest memory footprint possible for the JVM.
*/

public class LeetCode13 {

    public int romanToIntApproach1(String s) {

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

    /*
    For above code we use HashMap, which adds a bit of overhead because of object creation, hashing, and lookups.
    In competitive programming and platforms like LeetCode, replacing a map with a switch statement or
    a fixed-size primitive array is a classic optimization trick that drastically speeds up execution and lowers memory usage.
     */

    // Optimized using switch concept :
    public int romanToIntApproach2(String s) {
        int ans = 0;
        int len = s.length();
        int currentVal = 0;
        int prevVal = 0;

        // Traverse from right to left to simplify the logic and avoid boundary checks
        for (int i = len - 1; i >= 0; i--) {
            currentVal = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> currentVal;
            };

            // If the current value is less than the previous value seen to its right,
            // we subtract it (e.g., IV -> reads V then I, so 5 - 1)
            if (currentVal < prevVal) {
                ans -= currentVal;
            } else {
                ans += currentVal;
            }

            prevVal = currentVal;
        }

        return ans;
    }

    static void main(){
        LeetCode13 leetCode13 = new LeetCode13();
        System.out.println(leetCode13.romanToIntApproach1("III"));
        System.out.println(leetCode13.romanToIntApproach2("IV"));
    }
}
