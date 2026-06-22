package LeetcodeProb.Math;

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

    static void main(String[] args) {
        LeetCode258 leetCode258 = new LeetCode258();
        System.out.println(leetCode258.addDigits(38));
    }
}
