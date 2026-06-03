package LeetcodeProb.BitManipulation;

/*
    https://leetcode.com/problems/flipping-an-image?envType=problem-list-v2&envId=bit-manipulation
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
