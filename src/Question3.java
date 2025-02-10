import java.util.Scanner;


 class CircleMenu{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            System.out.print("Choose an option (1-3): ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + calculateArea(radius));
                    break;


                case 2:
                    System.out.print("Enter the radius: ");
                    radius = scanner.nextDouble();
                    System.out.println("Circumference of the circle: " + calculateCircumference(radius));
                    break;


                case 3:
                    System.out.println("Exiting...");
                    break;


                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 3);


    }


    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }


    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
