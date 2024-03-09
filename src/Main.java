import Sorting.*;
import Searching.*;
import Stack.Stack;
import Queue.Queue;
import LinkedLists.LinkedList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Searching  \n2. Sorting \n3. Stack \n4. Queue  \n5. LinkedLists" );
        System.out.print("Enter Your Choice : ");
        int ds = scanner.nextInt();
        if (ds == 1 | ds == 2) {
            System.out.print("Enter the size: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            System.out.print("Elements are :");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (ds == 1) {
                System.out.println("1. Binary \n2. Linear");
                int searchAlgo = scanner.nextInt();
                if (searchAlgo == 1) {
                    BinarySearch bs = new BinarySearch();
                    while (true) {
                        System.out.println("1. Search");
                        System.out.println("2. Exit");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Enter data: ");
                                int element = scanner.nextInt();
                                System.out.println("Index of " + choice + ": " + bs.binarySearch(arr, element));
                                break;
                            case 2:
                                System.out.println("Exiting...");
                                scanner.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                    }
                } else if (searchAlgo == 2) {
                    LinearSearch ls = new LinearSearch();
                    while (true) {
                        System.out.println("1. Search");
                        System.out.println("2. Exit");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Enter data: ");
                                int element = scanner.nextInt();
                                System.out.println("Index of " + choice + ": " + ls.linearSearch(arr, element));
                                break;
                            case 2:
                                System.out.println("Exiting...");
                                scanner.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                    }
                } else {
                    System.out.println("Enter valid choice.");
                }

            }
            else {
                while (true){
                    System.out.println("1. BubbleSort  \n2. Selection \n3. Insertion \n4. MergeSort  \n5. QuickSort \n6. Exit");
                    System.out.print("choose: ");
                    int sortAlgo = scanner.nextInt();
                    switch(sortAlgo){
                        case 1:
                            BubbleSort bs = new BubbleSort();
                            System.out.println("Bubble sorted array: " + Arrays.toString(bs.sort(arr)));
                            break;
                        case 2:
                            SelectionSort ss = new SelectionSort();
                            System.out.println("Selection sorted array: " + Arrays.toString(ss.sort(arr)));
                            break;
                        case 3:
                            InsertionSort is = new InsertionSort();
                            System.out.println("Insertion sorted array: " + Arrays.toString(is.sort(arr)));
                            break;
                        case 4:
                            MergeSort ms = new MergeSort();
                            System.out.println("Merge sorted array: " + Arrays.toString(ms.sort(arr)));
                            break;
                        case 5:
                            QuickSort qs = new QuickSort();
                            System.out.println("Quick sorted array: " + Arrays.toString(qs.sort(arr)));
                            break;
                        case 6:
                            System.out.println("Exiting...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                }
            }
        }

        else if (ds == 3){
            System.out.println("Enter the size of Stack: ");
            int size = scanner.nextInt();
            Stack stack = new Stack(size);
            while (true) {
                System.out.println("\nEnter your choice:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Size");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                        System.out.println("Element " + element + " pushed into the stack.");
                        break;
                    case 2:
                        if (!stack.isEmpty()) {
                            int poppedElement = stack.pop();
                            System.out.println("Popped element: " + poppedElement);
                        } else {
                            System.out.println("Stack is empty. Cannot pop.");
                        }
                        break;
                    case 3:
                        System.out.println("Size of the stack: " + stack.size());
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
        else if (ds == 4){
            System.out.println("Enter the size of Queue: ");
            int size = scanner.nextInt();
            Queue queue = new Queue(size);

            System.out.println("Queue Operations Program");
            while (true) {
                System.out.println("\nEnter your choice:");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to enqueue: ");
                        int element = scanner.nextInt();
                        queue.enQueue(element);
                        System.out.println("Element " + element + " enqueued into the queue.");
                        break;
                    case 2:
                        if (!queue.isEmpty()) {
                            int dequeuedElement = queue.deQueue();
                            System.out.println("Dequeued element: " + dequeuedElement);
                        } else {
                            System.out.println("Queue is empty. Cannot dequeue.");
                        }
                        break;
                    case 3:
                        queue.display();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }



        else if (ds == 5){
            LinkedList myList = new LinkedList();
            while (true) {
                System.out.println("\nEnter your choice:");
                System.out.println("1. Insert Node at Position");
                System.out.println("2. Show Elements");
                System.out.println("3. Delete Node at First");
                System.out.println("4. Insert Node at First");
                System.out.println("5. Delete Node at Last");
                System.out.println("6. Get Size");
                System.out.println("7. Delete Node at Position");
                System.out.println("8. Insert Node at Last");
                System.out.println("9. Exit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter data: ");
                        int data = scanner.nextInt();
                        System.out.print("Enter position: ");
                        int position = scanner.nextInt();
                        myList.insertNodeAtPosition(data, position);
                        break;
                    case 2:
                        myList.showElements();
                        break;
                    case 3:
                        myList.deleteAtFirst();
                        break;
                    case 4:
                        System.out.print("Enter data: ");
                        int dataFirst = scanner.nextInt();
                        myList.insertNodeAtFirst(dataFirst);
                        break;
                    case 5:
                        myList.deleteAtLast();
                        break;
                    case 6:
                        System.out.println("Size of the list: " + myList.getSize());
                        break;
                    case 7:
                        System.out.print("Enter position: ");
                        int positionToDelete = scanner.nextInt();
                        myList.deleteAtPosition(positionToDelete);
                        break;
                    case 8:
                        System.out.print("Enter data: ");
                        int dataLast = scanner.nextInt();
                        myList.insertNodeAtLast(dataLast);
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }

        else{
            System.out.println("Please! Enter the correct data structure.");
        }
    }
}
