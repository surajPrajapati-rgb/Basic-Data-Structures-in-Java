package LinkedList;
public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }

        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insert(list, 1);
        insert(list, 3);
        insert(list, 4);
        list = insert(list, 6);
        list = insert(list, 5);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 2);

        printList(list);
    }
}


//
//class Node {
//    int data;
//    Node next;
//    Node(int d) {
//        data = d;
//        next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//    int size;
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        size += 1;
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public void getsize(){
//        System.out.println(size);
//    }
//
//    public void first(){
//        System.out.println(head.data);
//    }
//
//    public void removefirst(){
//        size -= 1;
//        if (head == null){
//            System.out.println("no data");
//        }
//        else{
//            System.out.println("Removed : " + head.data);
//            head = head.next;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        System.out.println("Linked list elements:");
//        list.display();
//        list.first();
//        list.removefirst();
//        list.removefirst();
//        list.display();
//        list.getsize();
//    }
//}
