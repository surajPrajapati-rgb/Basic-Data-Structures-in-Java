package Searching;

class BinarySearch {
    int binarySearch(int arr[], int element, int low, int high) {
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
    int binarySearch(double arr[], double element, int low, int high) {
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
