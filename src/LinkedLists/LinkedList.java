package LinkedLists;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int getSize() {
        Node currNode = head;
        int size = 0;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }
    void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }
    void insertNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head.next;
            Node node2ndLast = head;
            while (currNode != null) {
                currNode = currNode.next;
                node2ndLast = node2ndLast.next;
            }
            node2ndLast.next = newNode;
        }
    }
    void insertNodeAtPosition(int data, int pos){
        Node newNode = new Node(data);
        if(pos<0){
            System.out.println("Invalid position to insert ");
        }
        else{
            if(pos==0){
                insertNodeAtFirst(data);
            }
            else if(pos==getSize()){
                insertNodeAtLast(data);
            }
            else if (pos>getSize()){
                System.out.println("List has "+getSize()+" nodes, position should not exceed " + getSize());}
            else{
                Node currNode = head;
                int i = 1;
                while(i<pos){
                    i++;
                    currNode=currNode.next;
                }

            newNode.next=currNode.next;
            currNode.next=newNode;
                }
            }
        }
        void deleteAtFirst(){
            if(head==null){
                System.out.println("The list is empty, can't delete anything");
            }
            else{
                if(head.next==null){
                    System.out.println("Deleting the only node "+head.data);
                    head = null;
                }
                else{
                    head = head.next;
                }
            }
        }
    void deleteAtLast(){
        if(head==null){
            System.out.println("The list is empty, can't delete anything");
        }
        else{
            if(head.next==null){
                System.out.println("Deleting the only node "+head.data);
                head = null;
            }
            else{
                Node currNode = head.next.next;
                Node node2ndLast = head;
                while(currNode!=null){currNode = currNode.next;
                    node2ndLast = node2ndLast.next;
                }
                System.out.println("Deleting the node "+node2ndLast.next.data);
                node2ndLast.next=null;
            }
        }
    }
    void deleteAtPosition(int pos) {
        if (pos < 0) {
            System.out.println("Invalid position to delete ");
        } else {
            if (pos == 0) {
                deleteAtFirst();
            } else if (pos == getSize() - 1) {
                deleteAtLast();
            } else if (pos >= getSize()) {
                System.out.println("List has " + getSize() + " nodes, position should not exceed " + getSize());
            } else {
                Node currNode = head;
                int i = 1;
                while (i < pos) {
                    i++;
                    currNode = currNode.next;
                }
                currNode.next = currNode.next.next;
            }
        }
    }
    public void showElements() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.print(currNode + "\n");
        }
    }
}






//    public class Linked {
//    public static void main(String[] args) {
//        System.out.println("We are going to create our linked list...");
//        LinkedList myList = new LinkedList();
//        myList.insertNodeAtPosition(10, 2);
//        myList.deleteAtFirst();
//        myList.insertNodeAtFirst(5);
//        myList.showElements();
//        myList.deleteAtFirst();
//        myList.showElements();
//        myList.insertNodeAtFirst(4);
//        myList.showElements();
//        myList.insertNodeAtFirst(3);
//        myList.showElements();
//        myList.insertNodeAtFirst(2);
//        myList.showElements();
//        myList.insertNodeAtFirst(1);
//        myList.showElements();
//        myList.insertNodeAtPosition(10, 12);
//        myList.insertNodeAtLast(6);
//        myList.showElements();
//        myList.insertNodeAtLast(7);
//        myList.showElements();
//        myList.insertNodeAtLast(8);
//        myList.showElements();
//        myList.insertNodeAtLast(9);
//        myList.showElements();
//        myList.insertNodeAtPosition(10, 9);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.deleteAtFirst();
//        myList.showElements();
//        myList.deleteAtFirst();
//        myList.showElements();
//        myList.deleteAtLast();
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.deleteAtPosition(3);
//        myList.showElements();
//        myList.deleteAtPosition(1);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.insertNodeAtPosition(100, 1);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.insertNodeAtPosition(200, 1);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.insertNodeAtPosition(200, 5);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//        myList.insertNodeAtPosition(1000, 6);
//        myList.showElements();
//        System.out.println("Total number of nodes in the list is " + myList.getSize());
//    }
//}
