package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/sqrtx?envType=study-plan-v2&envId=binary-search
*/

public class LeetCode69 {

        public int mySqrt(int x) {

            if(x == 0 || x == 1){
                return x;
            }

            int start = 1;
            int end = x;
            int ans = 0;

            while(start <= end){

                int mid = start + ((end - start)/2);

                if((x/mid) == mid){
                    return  mid;
                }else if((x/mid) > mid ){
                    ans = mid;
                    start = mid + 1;
                }else{
                    end = mid - 1;

                }

            }

            return ans;

        }

        static void main() {
            int num = 8;

            LeetCode69 leetCode69 = new LeetCode69();

            System.out.println(leetCode69.mySqrt(num));
        }

}
