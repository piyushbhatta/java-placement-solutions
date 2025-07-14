package BinarySearch_II;

public class MinimumNumberOfDaysToMake_mBouquets {
    public static void main(String[] args) {
        int[] bloomsDay={7,7,7,7,12,7,7};
        System.out.println(minDays(bloomsDay,2,3));
    }
    public static int minDays(int[] bloomsDay, int m, int k){
        if(m*k> bloomsDay.length){
            return -1;
        }
        int start=bloomsDay[0];
        int end= bloomsDay[bloomsDay.length-1];
        for (int day: bloomsDay){
            start=Math.min(day,start);
            end=Math.max(day,end);
        }
        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(CheckForBloomDay(bloomsDay, m, k, mid)){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }

    private static boolean CheckForBloomDay(int[] bloomsDay, int m, int k, int mid) {
        int tempK=0;
        int tempM=0;
        for(int bloomDay: bloomsDay){
            if(tempK==k){
                tempM++;
                tempK=0;
            }
            if(mid>=bloomDay){
                tempK++;
            }else{
                tempK=0;
            }
        }
        if(tempK==k){
            tempM++;
        }
        return tempM>=m;
    }
}
