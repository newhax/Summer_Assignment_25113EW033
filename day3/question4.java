import java.util.Scanner;

public class question4 {

    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b) {
        // LCM of 0 and any number is always 0
        if (a == 0 || b == 0) {
            return 0;
        }
        
        // Using absolute values to handle negative inputs properly
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        
        // Formula: (a * b) / GCD
        return (absA / findGCD(absA, absB)) * absB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the result
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}

