package Sorting;

public class QuickSort {
    public int[] quickSort(int[] array){
        int low=0, high=array.length-1;
        applyQuickSort(array, low, high);
        return array;
    }
     static void applyQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            applyQuickSort(arr, low, pi - 1);
            applyQuickSort(arr, pi + 1, high);
        }
    }
     static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for(int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}

