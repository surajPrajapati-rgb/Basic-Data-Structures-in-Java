package Searching;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1; // not found
    }
    public static int linearSearch(double[] arr, double key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1; // not found
    }

}
