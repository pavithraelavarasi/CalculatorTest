import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator in Java");
        System.out.println("----------------------------");

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Exit");

            System.out.print("Enter choice(1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }

            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num1));
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}