public class Question1 {
    static String firstName = "Rohit"; // static variable
    static String lastName = "Upadhyay";
    static int age = 22;
    static { // This is static block
        System.out.println("First Name (from static block): " + firstName);
    }
    static void printLastName() { // This is static method
        System.out.println("Last Name (from static method): " + lastName);
    }
    public static void main(String[] args) {
        printLastName();
        System.out.println("Age (from static variable): " + age);
    }
}
