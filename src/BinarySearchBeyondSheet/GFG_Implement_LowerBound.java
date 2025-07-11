package BinarySearchBeyondSheet;

public class GFG_Implement_LowerBound {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 4, 6, 8};
        int target=4;
        System.out.println(lowerBound(arr, target));
    }
    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;  // low is the first index where arr[low] >= target, or arr.length
    }
}
