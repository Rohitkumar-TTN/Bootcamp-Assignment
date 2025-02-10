
import java.util.Scanner;
public class Question7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}

