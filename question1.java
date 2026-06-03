import java.util.Scanner;

public class question1 {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it is not prime
            }
        }
        
        return true; // No factors found, so it is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
