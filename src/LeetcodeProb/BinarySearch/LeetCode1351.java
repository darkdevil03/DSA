package LeetcodeProb.BinarySearch;

/*
    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix?envType=study-plan-v2&envId=binary-search

    Approches:
    1: Use Binary Search if only the rows are sorted.
       If the columns are random, the staircase method will fail,
       but binary search will still work perfectly.
       time complexity : mlog(n)

    2: Use Staircase Search when the matrix is a Young Tableau
       (sorted both row-wise and column-wise).
       It is mathematically impossible to beat O(m + n)$ for this type of search.
 */

public class LeetCode1351 {

    // Approach 1:

    public int countNegativesApproach1(int[][] grid) {

        int row = 0;
        int rowLen = grid.length;
        int count=0;

        int randomCols; // for the case m x n size

        while(row < rowLen){

            int low = 0;                   // every column initial index as low
            int high = grid[row].length -1 ; // every column length index as high
            int firstNegativeIndex = high + 1; // Default if no negative is found

            randomCols = high + 1;

            while(low <= high)
            {
                int mid = low + ( (high - low) / 2 );

                if(grid[row][mid]<0){
                    high = mid - 1;
                    firstNegativeIndex = mid;
                }
                if(grid[row][mid] >= 0){
                    low = mid + 1;
                }

            }

            count+= ( randomCols - firstNegativeIndex );

            row++;
        }

        return count;
    }

    // Approach 2:

    public int countNegativesApproach2(int[][] grid) {

        int col = 0;
        int count=0;
        int pos = 0;

        int rowLen = grid.length-1;
        int colLen = grid[0].length;

        while(rowLen >= 0 && col < colLen ){

            if(grid[rowLen][col] < 0){
                count += (colLen - pos);
                rowLen--;
                col = 0;
                pos = 0;
            }else{
                pos++;
                col++;
            }

        }

        return count;
    }

    static void main() {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        LeetCode1351 leetCode1351 = new LeetCode1351();

        System.out.println(leetCode1351.countNegativesApproach1(grid));

        System.out.println(leetCode1351.countNegativesApproach2(grid));
    }

}
