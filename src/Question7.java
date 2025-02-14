import java.util.*;

public class Question7 {
    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();


        map.put(2, "B");
        map.put(3, "C");
        map.putFirst(1, "A");
        map.putLast(4, "D");

        System.out.println("Map after insertions: " + map);
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        System.out.println("\nPolling first and last entries...");
        System.out.println("Removed First Entry: " + map.pollFirstEntry());
        System.out.println("Removed Last Entry: " + map.pollLastEntry());

        System.out.println("\nMap after polling: " + map);
        System.out.println("Reversed Map: " + map.reversed());
    }
}
