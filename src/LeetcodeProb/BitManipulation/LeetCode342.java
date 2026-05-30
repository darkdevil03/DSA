package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/power-of-four?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode342 {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }

        while((n > 1) && (n % 4 == 0)){

            if(n == 4){
                return true;
            }

            n = n >> 2;
        }

        return false;

    }

    static void main() {

        int num = 16;

        LeetCode342 leetCode342 = new LeetCode342();

        System.out.println(leetCode342.isPowerOfFour(num));
    }
}
