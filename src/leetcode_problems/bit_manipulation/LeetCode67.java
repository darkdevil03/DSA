package leetcode_problems.bit_manipulation;

/*
    https://leetcode.com/problems/add-binary?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode67 {

    public String addBinary(String a, String b) {

        StringBuilder sum =new StringBuilder();

        int aLen = a.length() - 1;
        int bLen = b.length() - 1;

        int carry = 0;

        while(aLen >= 0 || bLen >= 0 || carry == 1){

            int a_Bit = (aLen >= 0) ? a.charAt(aLen) - '0' : 0;
            int b_Bit = (bLen >= 0) ? b.charAt(bLen) - '0' : 0;

            int bitLevelTotal = (carry + a_Bit + b_Bit);

            sum.append(bitLevelTotal % 2);

            carry = bitLevelTotal / 2;

            aLen--;
            bLen--;

        }

        return sum.reverse().toString();
    }


        static void main(){
            String a = "11";
            String b = "1";

            LeetCode67 leetCode67 = new LeetCode67();

            System.out.println(leetCode67.addBinary(a,b));
        }

}
