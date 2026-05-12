package Sorting;

import Sorting.Swap;

public class BubbleSort {

    Swap s=new Swap();  // method: swap(arr,index1,index2)

    //Ascending Order
    public int[] BubbleSortAsc(int[] arr){
        int len=arr.length-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++)
                if(arr[j]>arr[j+1])
                    s.swap(arr,j,j+1);
        }
        return arr;
    }

    //Descending order
    public int[] BubbleSortDsc(int[] arr){
        int len=arr.length-1;
        System.out.println();
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++)
                if(arr[j]<arr[j+1])
                    s.swap(arr,j,j+1);
        }
        return arr;
    }

}
