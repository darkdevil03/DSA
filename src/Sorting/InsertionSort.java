package Sorting;

public class InsertionSort {

    //Ascending Order
    public int[] insertionSortAsc(int[] arr){
        int n=arr.length;

        for(int currentPos = 1; currentPos < n; currentPos++){
            int shiftVal = arr[currentPos];
            int prev = currentPos-1;

            while( prev >= 0 && arr[prev] > shiftVal){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=shiftVal;
        }
        return arr;
    }


    //Descending Order
    public int[] insertionSortDsc(int[] arr){
        int n=arr.length;

        for(int currentPos = 1; currentPos < n; currentPos++){
            int shiftVal = arr[currentPos];
            int prev = currentPos-1;

            while( prev >= 0 && arr[prev] < shiftVal){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=shiftVal;
        }
        return arr;
    }

}
