package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/flipping-an-image?envType=problem-list-v2&envId=bit-manipulation

    Time Complexity: O(n*n)
        Row Loop        : The outer loop runs exactly $n$ times, where n is the number of rows in the matrix (image.length).
        Column Loop     : For each row, the inner loop runs from col = 0 up to col <= colLen / 2.
                          This means it iterates exactly (n/2) times (half the number of columns).
        Work Per Element: Inside the inner loop, swapping and inverting elements takes constant time, O(1).
                          Putting it together, the total number of operations is roughly: n * (n/2) =  ((n*n)/2).


    Space Complexity : O(1)
        In-Place Modification : Our code modifies the input image matrix directly in place.
        Auxiliary Space       : We only use a few primitive variables (row, colLen, col, and temp),
                                which take up a constant amount of memory regardless of the matrix size.
                                Therefore, the auxiliary space complexity is O(1) (constant space).

*/

import java.util.Arrays;

public class LeetCode832 {

    public int[][] flipAndInvertImage(int[][] image) {

        for(int row = 0; row < image.length; row++)
        {
            int colLen = image[row].length - 1;
            for(int col = 0; col <= (colLen/2); col++)
            {
                int temp = image[row][col];
                image[row][col] = image[row][colLen-col] ^ 1;
                image[row][colLen-col] = temp ^ 1;
            }
        }

        return image;
    }

    static void main(){
        LeetCode832 leetCode832 = new LeetCode832();

        int[][] img = new int[][]{{1,1,0},{1,0,1},{0,0,0}};

        for(int[] row : leetCode832.flipAndInvertImage(img)){
            System.out.println(Arrays.toString(row));
        }
    }
}
