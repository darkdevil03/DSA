package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/count-primes?envType=problem-list-v2&envId=math

    Approach 1 :

      Description :-
        The Time Limit Exceeded (TLE) error happens because this approach is a brute-force solution.
        For the input n = 5000000,  it is executing too many operations, causing it to exceed LeetCode's typical 1–2 second runtime limit.
        Why It Is Too Slow (Time Complexity)Your current algorithm checks every single number from 2 to n to see if it's prime:The outer loop runs n times.
        The inner loop checks for factors up to sqrt(i).For a large n, this results in an overall time complexity of O(n * sqrt(n)).
        When n = 5,000,000; sqrt(n) equals to approx 2236. So, Total operations approx 5,000,000 * 2236 times equals to approx {11,180,000,000} (over 11 billion operations!)
        A standard CPU handles roughly 10^8 (100 million) operations per second. This code requires over 100 seconds to finish, which is why LeetCode cuts it off.

      Complexity Analysis:-
        Time complexity  : O(n * sqrt(n))
        Space Complexity : O(1)

    Approach 2 :
      Description :-
        Instead of checking each number individually, you should use the Sieve of Eratosthenes.
        This algorithm works by iteratively marking the multiples of each prime number as composite (not prime), starting from 2.
        This reduces the time complexity drastically to O(n (log (log n))), which runs well within the time limit for n = 5,000,000.
        Why this optimization passes:
        -> Skipping Multiples: Instead of running an inner loop to check if a number is prime using division, it marks future composite numbers using simple addition (j = j + i).
        -> Starting at i^2: For any prime i, its multiples smaller than i^2 (like 2i, 3i, ...) have already been marked by smaller prime factors.
                            Starting at i times, 'i' saves massive amounts of redundant work.

      Complexity Analysis:-
        Time complexity  : O(n * log(log(n)))
        Space Complexity : O(n)

*/

public class LeetCode204 {

    // Approach 1: Brute-force solution
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

    // Approach 2: The Standard Sieve of Eratosthenes solution
    public int countPrimesApproach2(int n) {

        if (n < 2) return 0;

        // boolean array defaults to false.
        // We will consider 'false' as prime and 'true' as number is not prime.
        boolean[] isNotPrime = new boolean[n];

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;

                // Mark all multiples of 'i' starting from i * i as not prime
                // Use long 'j' for i * i to prevent integer overflow
                for (long j = (long) i * i; j < n; j += i) {
                    isNotPrime[(int) j] = true;
                }
            }
        }

        return count;
    }



    static void main() {
        LeetCode204 leetcode204 = new LeetCode204();

        System.out.println(leetcode204.countPrimes(500000));

        System.out.println(leetcode204.countPrimesApproach2(500000));

    }
}
