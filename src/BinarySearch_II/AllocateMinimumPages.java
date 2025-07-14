package BinarySearch_II;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] arr={12, 34, 67, 90};
        int k=2;
        System.out.println(findPages(arr,k));
    }
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        int start=arr[0];
        int end=0;
        for(int a:arr){
            start=Math.max(a,start);
            end+=a;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            int Students=CountStudents(arr, mid);
            if(Students>k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static int CountStudents(int[] arr, int mid){
        int Students=1;
        int pages=0;
        for(int a:arr){
            if(a+pages<=mid){
                pages+=a;
            }else{
                Students++;
                pages=a;
            }
        }
        return Students;
    }
}
