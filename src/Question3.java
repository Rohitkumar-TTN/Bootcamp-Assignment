import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question3 {
            public static void main(String[] args) {
            List<String> list = List.of("Apple", "Banana", "Cherry");
            System.out.println("Output of list "+list);
                Map<Integer,String> map=Map.of(
                        1,"Rohit",
                        2,"Anurag",
                        3,"Anant"
                );
                System.out.println("Output of map "+map);
            Set<String> set= Set.of("Rohit","Anurag","Anant");
            System.out.println("Output of Set "+set);
        }


}
