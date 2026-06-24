package course_04_sorting;

import java.util.Arrays;

public class Ex06_CycleSort {

    // for the range 1 to n elements of unsorted
    static Swap s = new Swap();    // method: swap(arr,index1,index2) from import Sorting.Swap; package

    public static void cycleSortStandard(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1){
                s.swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }

    }


    static void main(){

    // Cycle Sort

        // Random number generator for 1 to N numbers;
        RandomShuffleNumberArray oneToNGen= new RandomShuffleNumberArray();
        int[] rangeArr= oneToNGen.oneToNIntegers(15);

        // int[] rangeArr = {2,1,5,4,3,6,7,8,10,9};  // Hard-coded inputs;

        System.out.println("Input Arrays Integers Before Sorting ");
        System.out.println("Before Sort : " + Arrays.toString(rangeArr));



        System.out.println();
        System.out.println("Input Arrays Integers After Sorting ");

        System.out.println("Standard Cycle sort: ");
        cycleSortStandard(rangeArr);

        System.out.print("After Sort : ");
        for (int nums : rangeArr) {
            System.out.print(nums + " ");
        }

    }

}