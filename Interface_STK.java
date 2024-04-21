// Interface definition for a stack
public interface Interface_STK {
    // Method to push an element onto the stack
    void push(int element);

    // Method to pop an element from the stack
    int pop();

    // Method to display the contents of the stack
    void displayStack();

    // Method to check if the stack is full (overflow condition)
    boolean isOverFlow();

    // Method to check if the stack is empty (underflow condition)
    boolean isUnderFlow();
}