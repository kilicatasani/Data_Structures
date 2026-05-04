public class SimpleStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public SimpleStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // -1 means the stack is empty
    }

    // 1. Push: Add an element to the top
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot add " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    // 2. Pop: Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // 3. Peek: Look at the top element without removing it
    public int peek() {
        if (isEmpty()) return -1;
        return stackArray[top];
    }

    // 4. Utility: Check if empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        SimpleStack myStack = new SimpleStack(3);

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        myStack.push(400); // This will trigger Overflow

        System.out.println("Top element is: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());
        System.out.println("New top: " + myStack.peek());
    }
}
