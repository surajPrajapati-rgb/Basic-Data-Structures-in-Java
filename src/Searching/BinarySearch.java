package Searching;

public class BinarySearch {
    public int binarySearch(int[] arr, int element) {
        int low =0,  high=arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element)
                return mid;
            if (arr[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public int binarySearch(double[] arr, double element) {
        int low =0,  high=arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element)
                return mid;
            if (arr[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
