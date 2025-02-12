import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        List<String> unmodifiableList = Stream.of("Rohit", "Anurag", "Anant")
                .collect(Collectors.toUnmodifiableList());

        System.out.println(unmodifiableList);

       try{ unmodifiableList.add("Netik");}
      catch(Exception e){
          System.out.println("Exception occur while changing");
      }
    }
}

