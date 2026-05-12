package Sorting;

public class MergeSort {
    public void mergeSort(int[] arr, int leftLow, int rightHigh){

        if(leftLow<rightHigh){
            //divide and conquer
            int mid=(leftLow+rightHigh)/2;
            mergeSort(arr,leftLow,mid);
            mergeSort(arr,mid+1,rightHigh);

            //merging
            merge(arr,leftLow,mid,rightHigh);
        }
    }


    private void merge(int[] arr, int left, int mid, int right){
        int lenLeft=mid-left+1;
        int lenRight=right-mid;

        int[] leftArr=new int[lenLeft];
        int[] rightArr=new int[lenRight];

        for(int x=0;x<lenLeft;x++)
        {
            leftArr[x]=arr[x+left];
        }

        for(int y=0;y<lenRight;y++)
        {
            rightArr[y]=arr[y+mid+1];
        }

        int i=0; int j=0;
        int k=left; // order index starts hold for current arr track

        while(i<lenLeft && j<lenRight){
            if(leftArr[i]< rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                    arr[k]=rightArr[j];
                    j++;
            }
            k++;
        }


        while(i<lenLeft){
                arr[k]=leftArr[i];
                i++;
                k++;
            }
        while(j<lenRight){
                arr[k]=rightArr[j];
                j++;
                k++;
        }


    }

}
