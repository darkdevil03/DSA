package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/binary-number-with-alternating-bits?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode693 {
    public boolean hasAlternatingBits(int n) {
        int adjacent = n & 1;
        n = n >> 1;

        while(n > 0){
            if((n & 1) == adjacent)
                return false;
            adjacent = n & 1;
            n = n >> 1;
        }

        return true;
    }

    static void main(){
        LeetCode693 leetcode693 = new LeetCode693();
        System.out.println(leetcode693.hasAlternatingBits(5));
    }
}
