package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode762 {
    public int countPrimeSetBits(int left, int right) {
            int primes = 0;
            for(int i = left; i<=right; i++){

                // Built-in method uses a bit-masking trick that runs in constant time
                int count = Integer.bitCount(i);

                if (count == 2 || count == 3 || count == 5 || count == 7 ||
                        count == 11 || count == 13 || count == 17 || count == 19) {
                    primes++;
                }

            }

            return primes;
    }

    static void main(){
        LeetCode762 leetCode762 = new LeetCode762();
        System.out.println(leetCode762.countPrimeSetBits(6, 10));
    }
}
