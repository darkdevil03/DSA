package Sorting;

import Sorting.Swap;

public class QuickSort {

    Swap s=new Swap();

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

}
