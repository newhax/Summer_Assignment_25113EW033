
import java.util.Scanner;

public class question2 {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check for factors up to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; // No factors found, it is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Loop through the given range
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

    

