import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two numbers as input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Store original numbers for the final print statement
        int a = num1;
        int b = num2;

        // Apply the Euclidean algorithm using a while loop
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        // The remaining value in num1 is the HCF
        int hcf = num1;

        System.out.println("The HCF of " + a + " and " + b + " is: " + hcf);

        scanner.close();
    }
}

