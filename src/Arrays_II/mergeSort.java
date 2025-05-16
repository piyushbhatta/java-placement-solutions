package Arrays_II;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5,1,6,8,12,15,10,-7,-9};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr, int low, int high){
        if(low<high) {
            int mid = (high + low) / 2;

            mergesort(arr, low, mid);
            mergesort(arr, mid+1,high);

            merge(arr,low,mid,high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left = new int[n1];
        int[] right= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0; int j=0;
        int k=low;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    public static void sort(int[] arr, int low, int high){
        if(low<high){
            int mid=(low+high)/2;

            sort(arr,low,mid);
            sort(arr,mid+1,high);

            mergeSorting(arr,low,mid,high);
        }
    }

    private static void mergeSorting(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left=new int[n1];
        int[] right= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        // sort(arr,low,mid);
        // sort(arr,mid+1,high);
        // As for different there are different value of low that's why didn't initialise with k=0
        int k=low;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
}
