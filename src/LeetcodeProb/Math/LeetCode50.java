package LeetcodeProb.Math;

public class LeetCode50 {

    /*  The below approach has a couple of logical bugs, and more importantly, it will run into a Time Limit Exceeded (TLE) error.
        Right now, your code multiplies x one by one in a for loop, which takes O(n) time.
        Because n can be as large as 2^{31} - 1 (over 2 billion), a simple loop is much too slow for LeetCode's constraints. */

    public double myPowApproach1(double x, int n) {

        double res = 1.0;
        if(n > 0){
            for(int i = 1; i <= n ;i++){
                res = res * x;
            }
        }else{
            x = (1/x);
            for(int i = n; i < 0 ;i++){
                res =  res * x;
            }
        }

        return res;
    }

    // To resolve the above n large case to run in log (n) times follow the below approach :
    // Binary Exponentiation (or Exponentiation by Squaring)
    public double myPowApproach2(double x, int n) {

        double res = 1.0 ;
        // Use long to prevent overflow when converting Integer.MIN_VALUE to positive
        long N = n;

        if(n < 0){
            x = 1 / x;
            N = -N;
        }

        while(N > 0){
            // If N is odd, multiply the current product to the result
            if((N & 1) == 1){
                res = res * x;
            }
            // Square the base and halve the exponents
            x = x * x;
            N /=2;
        }

        return res;

    }


    static void main(){
        LeetCode50 leetCode50 = new LeetCode50();
        System.out.println(leetCode50.myPowApproach1(2.10, 2));
        System.out.println(leetCode50.myPowApproach2(2.10, 2));
    }
}
