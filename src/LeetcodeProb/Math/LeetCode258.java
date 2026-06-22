package LeetcodeProb.Math;

/*
    https://leetcode.com/problems/add-digits?envType=problem-list-v2&envId=math
 */

public class LeetCode258 {

    public int addDigits(int num) {

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

    static void main() {
        LeetCode258 leetCode258 = new LeetCode258();
        System.out.println(leetCode258.addDigits(38));
    }
}
