
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {


        Predicate<Integer> p = z -> z % 2 == 0;
        Function<Integer, Integer> F = x -> x * 2;
        Supplier<List<Integer>> S = () -> {
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        };
        Consumer<List<Integer>> c = (x)->System.out.println("After doing filter(only taking even values) and function(multiplying by 2) we are using it ->"+x);

         List<Integer>l=S.get();
         System.out.println("List of supplier"+l);

      List<Integer> example=l.stream().filter(p).map(F).collect(Collectors.toList());
      c.accept(example);
    }

}
