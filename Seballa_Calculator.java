import java.util.Scanner;

public class Seballa_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Take input from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Display menu for operations
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Exit");

            // Take operation choice from the user
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Perform the selected operation
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case 5:
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    continue;
            }

            // Display the result
            System.out.println("Result: " + result);

            // Ask if the user wants to perform another calculation
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            scanner.nextLine(); // Consume the newline character
            String continueChoice = scanner.nextLine().toLowerCase();

            if (!continueChoice.equals("yes")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

        } while (true);
    }
}