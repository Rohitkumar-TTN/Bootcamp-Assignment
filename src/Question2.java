import java.io.*;
import java.util.*;
 class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public String toFileFormat() {       return firstName + "," + lastName + "," + age + "," + phoneNumber;
    }
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(toFileFormat());
            writer.newLine();
            System.out.println("Data saved to: " + new java.io.File(filename).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Question2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "users.txt";
        while (true) {
            System.out.println("Enter First Name: ");
            String firstName = scanner.nextLine();


            System.out.println("Enter Last Name: ");
            String lastName = scanner.nextLine();


            System.out.println("Enter Age: ");
            int age = Integer.parseInt(scanner.nextLine());


            System.out.println("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();


            User user = new User(firstName, lastName, age, phoneNumber);
            user.saveToFile(filename);


            System.out.println("User saved successfully.");
            System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
            String choice = scanner.nextLine();


            if (choice.equalsIgnoreCase("QUIT")) {
                System.out.println("Exiting program...");
                break;
            }
        }
        scanner.close();
    }
}
