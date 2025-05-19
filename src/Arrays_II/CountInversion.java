package Arrays_II;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }
    public static int inversionCount(int arr[]) {
        return sort( arr,  0,  arr.length-1);
    }
    public static int sort(int[] arr, int low, int high){
        int count=0;
        if(low<high){
            int mid=low+(high-low)/2;

            count=count+sort(arr, low, mid);
            count=count+sort(arr, mid+1, high);

            count=count+merge(arr, low, mid, high);
        }
        return count;
    }
    public static int merge(int[] arr, int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left= new int[n1];
        int[] right= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[j+mid+1];
        }
        int i=0, j=0, k=low;
        int count=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                count=count+(n1-i);
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return count;
    }
}
