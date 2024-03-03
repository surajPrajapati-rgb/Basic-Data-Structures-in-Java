import Sorting.*;
import Searching.*;
import Stack.Stack;
import Queue.Queue;
import LinkedLists.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample example
        int[] arr = {10,12,9,4,15,23,15,20,5};

        //Searching Examples
        LinearSearch ls = new LinearSearch();
        int linearIndex = ls.linearSearch(arr,15);
        System.out.println("Linear search found element at index: " + linearIndex);
        BinarySearch bis = new BinarySearch();
        int biIndex = bis.binarySearch(arr, 15);
        System.out.println("Binary search found element at index: " + biIndex);
        System.out.println("\n");

        //  Sorting Examples
        int[] array = {5, 3, 2, 4, 1};
        BubbleSort bs = new BubbleSort();
        System.out.println("Bubble sorted array: " + Arrays.toString(bs.sort(array)));

        SelectionSort ss = new SelectionSort();
        System.out.println("Selection sorted array: " + Arrays.toString(ss.sort(array)));

        InsertionSort is = new InsertionSort();
        System.out.println("Insertion sorted array: " + Arrays.toString(is.sort(array)));

        MergeSort ms = new MergeSort();
        System.out.println("Merge sorted array: " + Arrays.toString(ms.sort(array)));

        QuickSort qs = new QuickSort();
        System.out.println("Quick sorted array: " + Arrays.toString(qs.sort(array)));
        System.out.println("\n");

        //Stack operations examples
        System.out.println("Stack's operations :  ");
        Stack st = new Stack(5); // Create a new stack with a size of 5st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.pop();
        st.pop();

        System.out.println("\n");
        //Queue operations examples
        System.out.println("Queue's operations :  ");
        Queue q = new Queue();
        q.deQueue();
        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display();
        q.deQueue();
        q.display();
        System.out.println("\n");

        //LinkedLists operations examples
        System.out.println("LinkedList's operations :  ");
        LinkedList myList = new LinkedList();
        myList.insertNodeAtPosition(10, 2);
        myList.showElements();
        myList.deleteAtFirst();
        myList.insertNodeAtFirst(5);
        myList.showElements();
        myList.deleteAtFirst();
        myList.showElements();
        myList.insertNodeAtFirst(4);
        myList.showElements();
        myList.insertNodeAtFirst(3);
        myList.showElements();
        myList.insertNodeAtFirst(2);
        myList.showElements();
        myList.insertNodeAtFirst(1);
        myList.showElements();
        myList.insertNodeAtPosition(10, 12);myList.insertNodeAtLast(6);
        myList.showElements();
        myList.insertNodeAtLast(7);
        myList.showElements();
        myList.insertNodeAtLast(8);
        myList.showElements();
        myList.insertNodeAtLast(9);
        myList.showElements();
        myList.insertNodeAtPosition(10, 9);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
        myList.deleteAtFirst();
        myList.showElements();
        myList.deleteAtFirst();
        myList.showElements();
        myList.deleteAtLast();
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
        myList.deleteAtPosition(3);
        myList.showElements();
        myList.deleteAtPosition(1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
        myList.insertNodeAtPosition(100,1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
        myList.insertNodeAtPosition(200,1);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());myList.insertNodeAtPosition(200,5);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
        myList.insertNodeAtPosition(1000,6);
        myList.showElements();
        System.out.println("Total number of nodes in the list is "+myList.getSize());
    }
}
