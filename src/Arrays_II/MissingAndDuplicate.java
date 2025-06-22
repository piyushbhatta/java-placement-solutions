package Arrays_II;

import java.util.*;

public class MissingAndDuplicate {
    public static void main(String[] args) {
        int[] nums1={4, 3, 6, 2, 1, 1};
        System.out.println((XOR(nums1)));

    }
    public static ArrayList<Integer> MissAndDupe(int[] arr){
        HashMap<Integer, Integer> freq =  new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i] , freq.getOrDefault(arr[i],0)+1);
        }
        int miss=0;
        int dupe=0;
        for(int i=1;i<=arr.length;i++){
            if(!freq.containsKey(i)){
                miss=i;
                continue;
            }
            if(freq.get(i)==2){
                dupe=i;
            }
        }
        list.add(0,dupe);
        list.add(1,miss);

        return list;
    }

    public static ArrayList<Integer> Mathematical(int[] arr){
        long n= arr.length;
        long S=0;
        long S2=0;
        long Sn=(n*(n+1))/2;
        long S2n=(n*(n+1)*(2*n+1))/6;
        for (int i=0;i<n;i++){
            S= (S+((long)arr[i]));
            S2=S2+((long)arr[i]*(long)arr[i]);
        }
        long val1=S-Sn;
        long val2=S2-S2n;
        val2=val2/val1;
        long X=(val1+val2)/2;
        long Y=X-val1;
        return new ArrayList<>(Arrays.asList((int) X, (int) Y));
    }

    public static ArrayList<Integer> XOR(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int xr=0;
        for(int i=0;i< arr.length;i++){
            xr=xr^arr[i];
            xr=xr^(i+1);
        }
        int bitNo=0;
        while(true){
            if((xr & (1<<bitNo))!=0){
                break;
            }
            bitNo++;
        }
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & (1<<bitNo))!=0){
                one = one ^ arr[i];
            }else{
                zero=zero^arr[i];
            }
        }

        for(int i=1;i<=arr.length;i++){
            if((i & (1<<bitNo))!=0){
                one = one ^i;
            }else{
                zero= zero^i;
            }
        }
        int cnt=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==zero) cnt++;
        }
        if(cnt==2) {
            list.add(0,zero);
            list.add(1,one);
        }else {
            list.add(0,one);
            list.add(1,zero);
        }
        return list;
    }
}
