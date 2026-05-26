package Sorting;

public class Swap {
    void swap(int []arr, int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
