import java.util.Scanner;

// Class definition
public class StackDemoGrowable {
    // Main method
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of Growable_STK using Interface_STK reference
        Interface_STK growable_stk = new Growable_STK();

        // Asking the user to enter the number of elements to add
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        // Loop to add elements to the growable stack
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            growable_stk.push(element);
        }

        int choice;
        // Main menu loop
        do {
            // Displaying menu options
            System.out.println("\n1. Add element to Growable Stack\n2. Display Growable Stack\n3. Pop from Growable Stack\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch statement to handle user choice
            switch (choice) {
                // Case 1: Add element to Growable Stack
                case 1:
                    System.out.print("Enter element to add to Growable Stack: ");
                    int growableElement = scanner.nextInt();
                    growable_stk.push(growableElement);
                    break;
                // Case 2: Display Growable Stack
                case 2:
                    growable_stk.displayStack();
                    break;
                // Case 3: Pop element from Growable Stack
                case 3:
                    growable_stk.pop();
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