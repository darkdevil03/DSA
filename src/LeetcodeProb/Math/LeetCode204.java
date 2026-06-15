package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/count-primes?envType=problem-list-v2&envId=math

    Approach 1 :

        The Time Limit Exceeded (TLE) error happens because this approach is a brute-force solution.
        For the input n = 5000000,  it is executing too many operations, causing it to exceed LeetCode's typical 1–2 second runtime limit.
        Why It Is Too Slow (Time Complexity)Your current algorithm checks every single number from 2 to n to see if it's prime:The outer loop runs n times.
        The inner loop checks for factors up to sqrt(i).For a large n, this results in an overall time complexity of O(n * sqrt(n)).
        When n = 5,000,000; sqrt(n) equals to approx 2236. So, Total operations approx 5,000,000 * 2236 times equals to approx {11,180,000,000} (over 11 billion operations!)
        A standard CPU handles roughly 10^8 (100 million) operations per second. This code requires over 100 seconds to finish, which is why LeetCode cuts it off.

        Time complexity  : O(n * sqrt(n))
        Space Complexity : O(1)



*/

public class LeetCode204 {
    public int countPrimes(int n) {

        if (n < 2) return 0;

        int count = n - 2;

        for(int i = 2; i < n; i++){
            for(long j = 2; j*j <= i; j++){
                if(i%j == 0){
                    count--;
                    break;
                }
            }
        }

        return count;
    }



    static void main() {
        LeetCode204 leetcode204 = new LeetCode204();

        System.out.println(leetcode204.countPrimes(20));

    }
}
