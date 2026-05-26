package Sorting;

public class SelectionSort {

    Swap s=new Swap();  // method: swap(arr,index1,index2) from import Sorting.Swap; package

    //Ascending Order
    public int[] SelectionSortAsc(int []arr,int len){

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
    public int[] SelectionSortDsc(int []arr, int len){

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

    static void main(){

    // Selection Sort
        int[] arrForAsc = {8, 6, 7, 1, 4, 2};
        int[] arrForDes = {8, 4, 6, 1, 7, 2};

        System.out.print("Before Sorting : ");
        for (int nums : arrForAsc) {
            System.out.print(nums + " ");
        }

        System.out.println();

        SelectionSort selection=new SelectionSort();

    // Ascending Order
        System.out.print("Ascending order using selection sorting : ");
        int[] resultSelectionAsc = selection.SelectionSortAsc(arrForAsc,arrForAsc.length);
        for(int nums : resultSelectionAsc){
            System.out.print(nums + " ");
        }

        System.out.println();

    // Descending Order
        System.out.print("Descending order using selection sorting : ");
        int[] resultSelectionDsc = selection.SelectionSortDsc(arrForDes,arrForDes.length);
        for(int nums : resultSelectionDsc){
            System.out.print(nums + " ");
        }

    }

}
