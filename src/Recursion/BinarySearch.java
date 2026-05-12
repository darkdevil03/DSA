package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int []arr,int target,int low,int high)
    {

        //int mid = low+(high-low)/2;
        int mid = (low+high)/2;
        //System.out.println(mid);

        if(target==arr[mid]){
            return mid+1;
        }
        if(target<arr[mid]&&high>low){
            return binarySearch(arr,target,low,mid-1);
        }
        if(target>arr[mid]&&low<high){
            return binarySearch(arr,target, mid+1,high);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size = sc.nextInt();
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        int result = binarySearch(arr,target,start,end);
        if(result==-1){
            System.out.println("Target not found!!");
        }
        else {
            System.out.println(" Target found at index : "+result);
        }
    }
}
