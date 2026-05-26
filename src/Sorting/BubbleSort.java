package Sorting;

public class BubbleSort {

    Swap s=new Swap();  // method: swap(arr,index1,index2) from import Sorting.Swap; package

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
    public int[] BubbleSortDes(int[] arr){
        int len=arr.length-1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i;j++)
                if(arr[j]<arr[j+1])
                    s.swap(arr,j,j+1);
        }
        return arr;
    }

    static void main(){

        int[] arrForAsc = {8, 6, 7, 1, 4, 2};
        int[] arrForDes = {8, 6, 7, 1, 4, 2};

    // Bubble Sort

        System.out.print("Before Bubble Sorting : ");
        for (int nums : arrForAsc) {
            System.out.print(nums + " ");
        }

        System.out.println();

        //Bubble Sort Ascending Order
        System.out.print("Bubble Sorting Ascending Order : ");
        BubbleSort bubbleAsc = new BubbleSort();
        int[] resultAsc = bubbleAsc.BubbleSortAsc(arrForAsc);
        for (int nums : resultAsc) {
            System.out.print(nums + " ");
        }

        System.out.println();

        //Bubble Sort Descending Order
        System.out.print("Bubble Sorting Descending Order : ");
        BubbleSort bubbleDsc = new BubbleSort();
        int[] resultDsc = bubbleDsc.BubbleSortDes(arrForDes);
        for(int nums :resultDsc) {
            System.out.print(nums + " ");
        }
    }

}
