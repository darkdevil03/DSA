package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/number-complement?envType=problem-list-v2&envId=bit-manipulation
*/

public class LeetCode476 {

    // Using StringBuilder as Extra Space ; Bruteforce
    public int findComplement(int num) {

        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));


        for(int i = 0; i < sb.length() ;i++){
            if(sb.charAt(i) == '1') {
                sb.setCharAt(i,'0');
            } else{
                sb.setCharAt(i,'1');
            }
        }

        return Integer.parseInt(sb.toString(),2);
    }

    static void main(){
        LeetCode476 leetCode476 = new LeetCode476();

        int num = 5;
        System.out.println("Before Complement of "+ num +" : "+Integer.toBinaryString(5));

        int result = leetCode476.findComplement(num);

        System.out.println("After Complement of "+ num +" : "+Integer.toBinaryString(result));

    }

}
