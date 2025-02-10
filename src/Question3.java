import java.io.*;
public class Question3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java WordCount <filename> <word>");
            return;
        }
        String filename = args[0];
        String searchWord = args[1];
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }
        System.out.println("The word '" + searchWord + "' appears " + count + " times in " + filename);
    }
}
