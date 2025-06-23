package beyondSheet;

import java.util.Arrays;

public class Q14_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergeSort(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void mergeSort(int[] nums1, int m, int[] nums2, int n){
        int[] helper = new int[m];
        for(int i=0;i<m;i++){
            helper[i]=nums1[i];
        }
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(helper[i]<nums2[j]){
                nums1[k++]=helper[i++];
            }else{
                nums1[k++]=nums2[j++];
            }
        }
        while(i<m){
            nums1[k++]=helper[i++];
        }
        while(j<n){
            nums1[k++]=nums2[j++];
        }
    }
}
