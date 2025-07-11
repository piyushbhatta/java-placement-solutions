package BinarySearchBeyondSheet;

import java.util.Arrays;

public class GFG_FloorCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 10};
        int target=5;
        System.out.println(Arrays.toString(findFloorAndCeil(arr,target)));
    }
    public static int[] findFloorAndCeil(int[] arr, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x) {
                floor = Math.max(floor, num);
            }
            if (num >= x) {
                if (ceil == -1) ceil = num;
                else ceil = Math.min(ceil, num);
            }
        }

        return new int[]{floor, ceil};
    }
}
