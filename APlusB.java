import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Calculate sum
        int sum = a + b;

        // Output result
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
