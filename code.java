import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        // Calculate and print the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
