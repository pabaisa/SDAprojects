package lt.sdacademy.algoritmsanddatastructure.datastructure.stack;

public class CustomStack {
    private int[] arr;
    private int size;
    private int top;

    public CustomStack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int num) {
        // ar stack'as nera pilnas?
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top++;
        arr[top] = num;
    }

    public int pop() {
        if (isEmty()) {
            System.out.println("Stack is emty");
        }
        int elemant = arr[top];
        top--;
        return elemant;
    }

    public int peek() {
        if (isEmty()) {
            System.out.println("Stack is emty");
        }
        return arr[top];
    }

    private boolean isFull() {
        return top == size;
    }

    public boolean isEmty() {
        return top < 0;
    }
}
