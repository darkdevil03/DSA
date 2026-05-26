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

    static void main(){

    // Insertion Sort
        int[] iAscArr={3,6,2,1,5};
        int[] iDesArr={3,6,2,1,5};

        System.out.print("Before Bubble Sorting : ");
        for (int nums : iAscArr) {
            System.out.print(nums + " ");
        }

        System.out.println();

        InsertionSort insertionSort = new InsertionSort();

        System.out.print("Insertion Sorting Ascending Order : ");

    //Ascending Order
        int[] resultInsertionAsc=insertionSort.insertionSortAsc(iAscArr);
        for(int nums : resultInsertionAsc){
            System.out.print(nums + " ");
        }

        System.out.println();

    // Descending Order
        System.out.print("Insertion Sorting Descending Order : ");
        int[] resultInsertionDsc=insertionSort.insertionSortDsc(iDesArr);
        for(int nums : resultInsertionDsc){
            System.out.print(nums + " ");
        }

    }

}
