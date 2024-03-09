package Queue;
public class Queue {
    int SIZE;
//    int lengthQueue;
    int[] items;
    int front, rear;
    public Queue(int s) {
        front = -1;
        rear = -1;
        this.items = new int[s];
        this.SIZE = s;
    }
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == -1;
    }
    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }
}
