package Sorting;

import java.util.Arrays;

public class QuickSort {

    Swap s=new Swap();          // method: swap(arr,index1,index2) from import Sorting.Swap; package

    private int partition(int[] arr, int low, int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                s.swap(arr,i,j);
            }
        }
        s.swap(arr,i+1,high);

        return i+1;
    }

    public int[] quickSortAsc(int[] arr, int low, int high){

        if(low<high){
            int pi=partition(arr,low,high);

            quickSortAsc(arr,low,pi-1);
            quickSortAsc(arr,pi+1,high);
        }
        return arr;
    }


    static void main(){

    //Quick Sort
        int[] arr={5,3,6,1,4,2};

        QuickSort quickSort = new QuickSort();

        System.out.println("Before sorting to ascending order : "+ Arrays.toString(arr));

        int[] resultQuickSortAsc=quickSort.quickSortAsc(arr,0, arr.length-1);

        System.out.print("After sorting to ascending order : ");

        for(int nums : resultQuickSortAsc){
            System.out.print(nums + " ");
        }
    }

}
