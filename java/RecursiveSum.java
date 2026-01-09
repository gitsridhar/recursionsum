import java.util.Scanner;

public class RecursiveSum {

    /**
     * Recursively calculates the sum of all positive integers less than or equal to n.
     *
     * @param n The upper limit (exclusive, the method sums up to n-1).
     * @return The sum of numbers from 1 to n-1.
     */
    public static int sumSequence(int n) {
        // Base case: if the number reaches 1 or less, the recursion stops and returns 0 for that step.
        // We sum numbers LESS THAN the input number, so n-1 is the highest number added.
        if (n <= 1) {
            return 0; 
        }
        
        // Recursive step: return (n-1) + the sum of all numbers less than (n-1).
        // For input 5, this expands as: 4 + sumSequence(4)
        // 4 + (3 + sumSequence(3))
        // 4 + 3 + (2 + sumSequence(2))
        // 4 + 3 + 2 + (1 + sumSequence(1))
        // 4 + 3 + 2 + 1 + 0 
        return (n - 1) + sumSequence(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();

            if (inputNumber <= 1) {
                System.out.println("The number must be greater than 1 to have a"
                                 + " sequence of numbers less than it to sum.");
            } else {
                int result = sumSequence(inputNumber);
                System.out.println("The sum of all numbers less than " + inputNumber + 
                                   " is: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        
        scanner.close();
    }
}
