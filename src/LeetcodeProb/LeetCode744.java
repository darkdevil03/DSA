package LeetcodeProb;

/*
    https://leetcode.com/problems/find-smallest-letter-greater-than-target?envType=study-plan-v2&envId=binary-search
 */

public class LeetCode744 {

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        int mid=0;

        while(start<=end){
            mid = start + ((end-start) / 2); // Prevents potential overflow

            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                // (letters[mid]<=target) : to avoid time limit exceed cause due to while true if equals not checks means !
                start=mid+1;
            }
        }

        return letters[start % letters.length];  // simple and avoid multiple exceptions handling !
    }

    public static void main(String[] args) {
        char[] letters = {'e','e','g','g'};
        char target = 'g';

        System.out.println(nextGreatestLetter(letters,target));
    }
}
