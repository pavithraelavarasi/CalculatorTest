# Scientific Calculator in Java

This is a simple scientific calculator implemented in Java. It allows users to perform basic arithmetic operations, as well as square root and power calculations.

## Features

*   Addition
*   Subtraction
*   Multiplication
*   Division
*   Square Root
*   Power

## How to Compile and Run

1.  Make sure you have Java Development Kit (JDK) installed on your system.
2.  Save the `ScientificCalculator.java` file to your local machine.
3.  Open a terminal or command prompt and navigate to the directory where you saved the file.
4.  Compile the code using the following command:

    ```bash
    javac ScientificCalculator.java
    ```

5.  Run the compiled code using the following command:

    ```bash
    java ScientificCalculator
    ```

## Code Explanation

The `ScientificCalculator.java` file contains the main class `ScientificCalculator` with a `main` method. The `main` method:

1.  Creates a `Scanner` object to read user input from the console.
2.  Displays a menu of available operations.
3.  Prompts the user to enter their choice.
4.  Based on the user's choice, performs the corresponding operation using a `switch` statement.
5.  Prints the result to the console.
6.  Repeats steps 2-5 until the user chooses to exit.
7.  Closes the `Scanner` object.

## Example Usage

```
Scientific Calculator in Java
----------------------------

Select operation:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square Root
6. Power
7. Exit
Enter choice(1-7): 1
Enter first number: 10
Enter second number: 5
Result: 15.0
```