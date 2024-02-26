package Sorting;
public class MergeSort {

    public int[] mergeSort(int[] array){
        applyMergeSort(array, 0, array.length - 1);
        return array;
    }
    static void applyMergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            applyMergeSort(array, start, mid);
            applyMergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k += 1; i += 1;
            } else {
                temp[k] = array[j];
                k += 1; j += 1;
            }
        }

        while (i <= mid) {
            temp[k] = array[i];
            k += 1; i += 1;
        }

        while (j <= end) {
            temp[k] = array[j];
            k += 1; j += 1;
        }

        for (i = start; i <= end; i += 1) {
            array[i] = temp[i - start];
        }
    }

}


