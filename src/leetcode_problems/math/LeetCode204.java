package leetcode_problems.math;

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


    Approach 3 :

        What Changed from Approach 2  (The Optimizations Explained)

        -->Half the Memory (new boolean[n / 2]):
            We completely map out even numbers. In this array, index 0 represents 1, index 1 represents 3, index 2 represents 5, and so on (2i + 1).
            This drastically reduces cache misses and lowers your memory footprint.

        -->Smart Step Sizes (j += 2 * i): If i = 3, its multiples are 6, 9, 12, 15, etc. We don't care about 6 or 12 because they are even.
            By adding 2 * i (3 + 6 = 9), we jump directly from one odd multiple to the next, cutting the inner loop operations in half.

        -->Early Stopping Condition (upperLimit): You only ever need to mark composites using primes up to sqrt(n).
            Once 'i' passes sqrt(n), the inner loop won't execute anyway, but checking if (i <= upperLimit) saves the CPU from doing the math to initialize the inner loop entirely.

        Complexity Analysis:-
        Time complexity  : O(n * log(log(n))) (but ~2.5x fewer operations).
        Space Complexity : O(n) (but uses exactly $\frac{1}{2}$ the memory).


    Note :  Remember, the LeetCode problem asks you to count the prime numbers strictly less than n.
            So, if (n <= 2) return 0; used in our approaches.

*/

public class LeetCode204 {

    // Approach 1: Brute-force solution
    public int countPrimes(int n) {

        if (n <= 2) return 0;

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

        if (n <= 2) return 0;

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

    // Approach 3: The Optimized Sieve of Eratosthenes solution
    public int countPrimesApproach3(int n) {
        // There are no primes strictly less than 3 (2 is the only prime, but n must be > 2 as per leetcode question)
        if (n <= 2) return 0;

        // isNotPrime[i] will represent the odd number (2 * i + 1)
        // This cuts memory usage in half!
        boolean[] isNotPrime = new boolean[n / 2];

        // Start count at 1 because we automatically include the number 2
        int count = 1;

        // Loop only through odd numbers starting from 3 (i = 1 represents 3)
        // Limit the loop to sqrt(n) for marking non-prime
        int upperLimit = (int) Math.sqrt(n);

        for (int i = 3; i < n; i += 2) {
            if (!isNotPrime[i / 2]) {
                count++;

                // Only mark multiples if i is less than or equal to sqrt(n)
                // This avoids internal loop overhead when i * i >= n
                if (i <= upperLimit) {
                    // Jump by 2 * i to skip even multiples (e.g., if i=3, skip 6, 12, mark 9, 15)
                    for (int j = i * i; j < n; j += 2 * i) {
                        isNotPrime[j / 2] = true;
                    }
                }
            }
        }

        return count;
    }


    static void main() {
        LeetCode204 leetcode204 = new LeetCode204();

        System.out.println(leetcode204.countPrimes(5000000));

        System.out.println(leetcode204.countPrimesApproach2(5000000));

        System.out.println(leetcode204.countPrimesApproach3(5000000));

    }
}
