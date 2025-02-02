# LIFO Data Structure: Building a Stack in Java

This repository demonstrates two different implementations of a **Stack (LIFO - Last In, First Out)** data structure in Java:

1. **Fixed-Size Stack** (`Fixed_STK`)  
2. **Growable (Dynamic) Stack** (`Growable_STK`)

Both implementations adhere to a common interface (`Interface_STK`) to ensure consistent behavior, including methods for push, pop, display, and checks for overflow/underflow conditions.

---

## Project Structure

The repository contains the following key files:

1. **`Interface_STK.java`**  
   - Defines the contract for any stack implementation.
   - Declares the methods `push(int)`, `pop()`, `displayStack()`, `isOverFlow()`, and `isUnderFlow()`.

2. **`Fixed_STK.java`**  
   - Implements a fixed-size stack using an integer array.
   - `push` and `pop` operations rely on a `top` index to track the stack's current size.
   - Checks for overflow (`isOverFlow()`) by comparing `top` with the array's length.

3. **`Growable_STK.java`**  
   - Implements a dynamic (growable) stack using an `ArrayList<Integer>`.
   - Eliminates overflow concerns by letting the `ArrayList` handle size expansion.
   - Maintains a `top` index to track the top element’s position.

4. **`StackDemo.java`**  
   - Demonstrates the usage of the fixed-size stack.
   - Prompts the user for the initial size of the stack and then allows push, pop, and display operations via a menu-driven interface.

5. **`StackDemoGrowable.java`**  
   - Demonstrates the usage of the growable stack.
   - Uses a similar menu-driven approach, allowing the user to push, pop, and display elements without worrying about hitting a maximum capacity.

---

## How to Run

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-username/LIFO-Data-Structure-Building-a-Stack-in-Java.git
   ```
   
2. **Compile the Code**  
   Navigate to the directory containing the `.java` files and compile them:
   ```bash
   javac Interface_STK.java Fixed_STK.java Growable_STK.java StackDemo.java StackDemoGrowable.java
   ```
   
3. **Run the Demos**  
   - **Fixed Stack Demo**  
     ```bash
     java StackDemo
     ```
   - **Growable Stack Demo**  
     ```bash
     java StackDemoGrowable
     ```

4. **Follow the On-Screen Instructions**  
   Each demo will prompt you for the number of elements to add initially and then present a menu to push more elements, pop elements, display the stack contents, or exit the program.

---

## Features

- **Common Interface**: Both stacks implement `Interface_STK` for consistent method signatures.
- **Overflow/Underflow Checks**: 
  - `Fixed_STK` checks and warns if the stack is full.
  - `Growable_STK` doesn’t overflow but still checks for underflow when popping.
- **Menu-Driven Demos**: Two separate driver classes (`StackDemo` and `StackDemoGrowable`) to illustrate usage via simple console interactions.

---

## Possible Improvements

- Replace the `System.out.println("Stack is empty")` or `"Stack is full"` with custom exceptions for better error handling.
- Add unit tests (e.g., JUnit) to verify the correctness of each method (`push`, `pop`, `displayStack`, etc.).
- Enhance user interface or integrate with a GUI for a more interactive experience.
- Consider using generics to make the stack implementation type-safe for different data types beyond `int`.

---

## Contributing

1. Fork this repository.
2. Create a feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add a new feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request to discuss and merge your changes.

---

## License

You can include a license of your choice (e.g., [MIT License](https://choosealicense.com/licenses/mit/)) here. If you’re uncertain, you can remove this section or simply mention that all rights are reserved.

---

**Thank you for checking out this project!** If you find it helpful or have suggestions for improvement, please feel free to open an issue or submit a pull request. Enjoy exploring the world of stack-based data structures!
