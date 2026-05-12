package Sorting;

public class CycleSort {
    // for the range 1 to n elements of unsorted
    Swap s = new Swap();

    public void cycleSortStandard(int[] arr) {
        int i = 0;
        int trialSwaps = 0;
        int trialCompares = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1){
                trialCompares++;
                s.swap(arr, i, arr[i] - 1);
                trialSwaps++;
            }

            else{
                i++;
                trialCompares++;
            }

        }
        System.out.println("Swap Count : " + trialSwaps + " Compare Count: " + trialCompares);
    }


    public void cycleSortTrial(int[] arr) {
        int len = arr.length - 1;
        int len1=arr.length - 1;
        int midF = (len1) / 2;
        int midB = (len1) / 2 - 1;
        int trialSwaps = 0;
        int trialCompares = 0;
        for (int i = 0; i < len1; i++) {
            if (arr[i] != i + 1) {
                s.swap(arr, i, arr[i] - 1);
                trialSwaps++;
            }
            if (arr[len] != len+1) {
                s.swap(arr, len, arr[len]-1);
                trialSwaps++;
            }
            //if(true){
            if(midF<len1 && arr[midF]!=midF+1 ){
                s.swap(arr, midF, midF-1);
            }
            
            //}
            len--;
            midF++;
            trialCompares += 2;

        }
        System.out.println("Swap Count : " + trialSwaps + " Compare Count: " + trialCompares);
    }
}
/*
    System.out.println();
        System.out.println("Trial cycle Sort: ");
        CycleSort trial = new CycleSort();
        trial.cycleSortTrial(rangeArr2);
        for (int nums : rangeArr2) {
            System.out.print(nums + " ");
        }
        System.out.println();
*/
