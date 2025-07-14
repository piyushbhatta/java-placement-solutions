package BinarySearch_II;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,h));
    }
    public static int minEatingSpeed(int[] piles, int h){
        int start=1;
        int end=piles[0];
        for(int p:piles){
            end=Math.max(end,p);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(minHour(piles,h,mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static boolean minHour(int[] piles, int h, int k){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=(piles[i]+k-1)/k;
        }
        return hour<=h;
    }
}
