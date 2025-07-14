package BinarySearch_II;

public class KthElementOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1={2, 3, 6, 7, 9};
        int[] nums2={1, 4, 8, 10};
        int k=5;
        System.out.println(KthElement(nums1,nums2,k));
    }
    public static int KthElement(int[] nums1, int[] nums2, int k){
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2) return KthElement(nums2,nums1,k);
        int start=Math.max(0,k-n2);
        int end=Math.min(k,n1);
        int n=n1+n2;
        int left=k;
        while(start<=end){
            int mid1=start+(end-start)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE; int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE; int r2=Integer.MAX_VALUE;
            if(mid1-1>=0) l1=nums1[mid1-1];
            if(mid2-1>=0) l2=nums2[mid2-1];
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            } else if (l1>r2) {
                end=mid1-1;
            }else{
                start=mid1+1;
            }
        }
        return -1;
    }
}
