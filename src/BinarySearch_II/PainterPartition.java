package BinarySearch_II;

public class PainterPartition {
    public static void main(String[] args) {
        int[] arr={5, 10, 30, 20, 15};
        int k=3;
        System.out.println(minTime(arr,k));
    }
    public static int minTime(int[] arr, int k) {
        int start = arr[0];
        int end = 0;
        for (int a : arr) {
            start = Math.max(start, a);
            end += a;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int a : arr) {
                if (a + sum > mid) {
                    pieces++;
                    sum = a;
                } else {
                    sum += a;
                }
            }
            if (pieces <= k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
