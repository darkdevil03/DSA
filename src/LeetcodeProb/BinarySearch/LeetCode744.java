package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/find-smallest-letter-greater-than-target?envType=study-plan-v2&envId=binary-search
 */

public class LeetCode744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        int mid;

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

    static void main() {
        char[] letters = {'e','e','g','g'};
        char target = 'g';

        LeetCode744 leetCode744 = new LeetCode744();

        System.out.println(leetCode744.nextGreatestLetter(letters,target));
    }
}
