package Sorting;

import Sorting.Swap;

public class SelectionSort {

    Swap s=new Swap();  // method: swap(arr,index1,index2)
    //Ascending Order
    public int[] SelectionSortAsc(int []arr){

        int len=arr.length;
        int min;
        for(int i=0;i<len-1;i++){
            min=i;
            for(int j=i+1;j<len;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            s.swap(arr,i,min);
        }
        return arr;
    }

    //Descending Order
    public int[] SelectionSortDsc(int []arr){
        int len=arr.length;
        int max;
        for(int i=0;i<len-1;i++){
            max=i;
            for(int j=i+1;j<len;j++){
                if(arr[max]<arr[j]) // checking for more max if not the intially max with positional based max 1,2,3..
                    max=j;
            }
            s.swap(arr,i,max);
        }
        return arr;
    }

}
