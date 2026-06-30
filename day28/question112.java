import java.util.Scanner;

public class question112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.println("\nContact Saved");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);

        sc.close();
    }
}