package BinarySearch_II;

public class CapacityToShipPackages {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        System.out.println(leastWeight(weights,5));
    }
    public static int leastWeight(int[] weights, int Days){
        int start=weights[0];
        int end=weights[0];
        for(int i=1;i<weights.length;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if(checkWeight(weights,mid,Days)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    private static boolean checkWeight(int[] weights, int mid, int Days) {
        int Day=1;
        int weight=0;
        for(int i=0;i<weights.length;i++){
            if(weight+weights[i]>mid){
                Day++;
                weight=weights[i];
            }else{
                weight+=weights[i];
            }
        }
        return Day<=Days;
    }
}
