package beyondSheet;

public class Q19_CountInversion {
    public static void main(String[] args) {
        int[] nums={2, 4, 1, 3, 5};
        System.out.println(inversionCount(nums));
    }
    public static int inversionCount(int[] arr){
        return CountMergeSort(arr,0, arr.length-1);
    }
    public static int CountMergeSort(int[] nums, int low, int high){
        int count=0;
        if(low<high){
            int mid=low+(high-low)/2;

            count+=CountMergeSort(nums,low, mid);
            count+=CountMergeSort(nums,mid+1, high);

            count+=merge(nums, low, mid , high);
        }
        return count;
    }

    private static int merge(int[] nums, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left = new int[n1];
        int[] right= new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=nums[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        int count=0;
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
                count=count+n1-i;
            }
        }
        while(i<n1){
            nums[k++]=left[i++];
        }
        while(j<n2){
            nums[k++]=right[j++];
        }
        return count;
    }
}
