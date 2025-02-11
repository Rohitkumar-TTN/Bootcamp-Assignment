import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int answer=list.stream().filter(x->x>5).mapToInt(x->x).sum();
        System.out.println("The sum of all the numbers greater than 5 is "+answer);
    }
}
