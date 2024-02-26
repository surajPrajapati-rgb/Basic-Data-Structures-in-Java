import Sorting.InsertionSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import Sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 9, 3, 5, 2, 4, 7};
        SelectionSort t = new SelectionSort();
        System.out.println(Arrays.toString(t.selectionSort(arr)));
    }
}
