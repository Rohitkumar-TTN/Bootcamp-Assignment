
import java.util.ArrayList;
import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        System.out.println("Enter text (type 'XDONE' to stop):");
        while (true) {
            String userInput = scanner.nextLine();


            if (userInput.equals("XDONE")) {
                break;
            }


            inputList.add(userInput);
        }
        System.out.println("\nYou entered:");
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(inputList.get(i));
        }
    }
}
