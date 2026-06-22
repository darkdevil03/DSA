package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/add-digits?envType=problem-list-v2&envId=math
 */

public class LeetCode258 {

    // Loop based approach
    public int addDigitsApproach1(int num) {
        int sum = 0;

        while(num > 0){
            sum = sum + (num % 10);
            num /=10;
            if((num == 0) && (sum > 9)){
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }

    // Optimized : Single modulo arithmetic operation approach
    public int addDigitsApproach2(int num) {

        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;

        return num % 9;
    }

    // Main method
    static void main() {
        LeetCode258 leetCode258 = new LeetCode258();
        System.out.println(leetCode258.addDigitsApproach1(38));
        System.out.println(leetCode258.addDigitsApproach2(38));
    }
}
