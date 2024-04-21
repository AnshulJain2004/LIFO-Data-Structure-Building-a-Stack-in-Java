import java.util.ArrayList;

// Class definition for a growable stack implementing the Interface_STK interface
public class Growable_STK implements Interface_STK {
    // ArrayList to store stack elements
    private ArrayList<Integer> stack;
    // Variable to keep track of the top element of the stack
    private int top;

    // Constructor to initialize the stack
    public Growable_STK() {
        stack = new ArrayList<>();
        top = -1; // Initially, the stack is empty, so top is set to -1
    }

    // Method to push an element onto the stack
    @Override
    public void push(int element) {
        stack.add(element); // Adding the element to the ArrayList
        top++; // Incrementing the top pointer
    }

    // Method to pop an element from the stack
    @Override
    public int pop() {
        // Checking for underflow condition
        if (isUnderFlow()) {
            System.out.println("Stack is empty");
            return -1; // Consider throwing an exception here instead of returning -1
        } else {
            int element = stack.remove(top); // Removing the top element from the ArrayList
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
                System.out.println(stack.get(i));
            }
        }
    }

    // Method to check for overflow (not applicable for growable stack)
    @Override
    public boolean isOverFlow() {
        return false; // Growable stack never overflows
    }

    // Method to check for underflow
    @Override
    public boolean isUnderFlow() {
        return top == -1; // Stack is underflow if top is -1
    }
}