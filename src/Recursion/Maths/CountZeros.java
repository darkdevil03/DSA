package Recursion.Maths;

public class CountZeros {
    static int count(int num){
        int ans = 0;
        if(num == 0){
            return ans;
        }
        if(num%10==0){
            ans=1;
        }
        return ans+count(num/10);
    }
    public static void main(String[] args) {
        int num=3020020;
        System.out.print("Number of Zeros in given input : "+count(num));
    }
}
