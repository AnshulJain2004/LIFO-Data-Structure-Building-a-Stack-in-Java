// Class definition for a fixed-size stack implementing the Interface_STK interface
public class Fixed_STK implements Interface_STK {
    // Array to store stack elements
    private final int[] stack;
    // Variable to keep track of the top element of the stack
    private int top;

    // Constructor to initialize the fixed-size stack with the specified maximum size
    public Fixed_STK(int max_size) {
        stack = new int[max_size]; // Creating a new array with the specified maximum size
        top = -1; // Initially, the stack is empty, so top is set to -1
    }

    // Method to push an element onto the stack
    @Override
    public void push(int element) {
        // Checking for overflow condition
        if (isOverFlow())
            System.out.println("Stack is Full"); // Print a message if the stack is full
        else {
            top++; // Incrementing the top pointer
            stack[top] = element; // Adding the element to the stack
        }
    }

    // Method to pop an element from the stack
    @Override
    public int pop() {
        // Checking for underflow condition
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
            return -1; // Consider throwing an exception here instead of returning -1
        } else {
            int element = stack[top]; // Storing the top element
            top--; // Decrementing the top pointer
            return element; // Returning the popped element
        }
    }

    // Method to display the elements of the stack
    @Override
    public void displayStack() {
        System.out.println("Stack Elements are:");
        // Checking for underflow condition
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
        } else {
            // Loop to iterate through the elements of the stack and print them
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    // Method to check for overflow
    @Override
    public boolean isOverFlow() {
        return top == stack.length - 1; // Stack is overflow if top is equal to the maximum size of the stack
    }

    // Method to check for underflow
    @Override
    public boolean isUnderFlow() {
        return top == -1; // Stack is underflow if top is -1
    }
}