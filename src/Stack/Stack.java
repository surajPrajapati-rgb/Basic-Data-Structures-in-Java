package Stack;

public class Stack {
    int n;
    int size;
    int[] arr;
    int top;
    public Stack(int n) {
        this.n = n;
        this.arr = new int[n];
        this.top = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (n - 1 == top);
    }
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
            size++;
        } else {
            System.out.println("Stack is full !");
        }
    }
    public int size(){
        return size;
    }
    public int pop() {
        if (!isEmpty()) {
            size--;
            int poppedElement = top;
            top--;
            System.out.println("Popped element :" + arr[poppedElement]);
            return arr[poppedElement];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    public int peek() {
        if (!this.isEmpty())
            return arr[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }
}
