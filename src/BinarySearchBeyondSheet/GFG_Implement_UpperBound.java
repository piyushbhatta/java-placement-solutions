package BinarySearchBeyondSheet;

public class GFG_Implement_UpperBound {
    public static void main(String[] args) {

    }
    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;  // First index where arr[low] > target
    }
}
