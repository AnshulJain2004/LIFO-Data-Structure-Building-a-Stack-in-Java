import java.util.Scanner;

// Class definition
public class StackDemo {
    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        // Creating an instance of the Fixed_STK class with the specified number of elements
        Fixed_STK fixed_stk = new Fixed_STK(numElements);

        // Loop to add elements to the stack
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            fixed_stk.push(element);
        }

        int choice;
        // Main menu loop
        do {
            // Displaying menu options
            System.out.println("\n1. Add element\n2. Display stack\n3. Pop element\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch statement to handle user choice
            switch (choice) {
                // Case 1: Add element
                case 1:
                    System.out.print("Enter element to add: ");
                    int newElement = scanner.nextInt();
                    fixed_stk.push(newElement);
                    break;
                // Case 2: Display stack
                case 2:
                    fixed_stk.displayStack();
                    break;
                // Case 3: Pop element
                case 3:
                    fixed_stk.pop();
                    break;
                // Case 4: Exit program
                case 4:
                    System.out.println("Exiting program.");
                    break;
                // Default case: Invalid choice
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4); // Continue loop until user chooses to exit

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}