import java.util.*;


class SumOfList {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        numbers.add(10.5f);
        numbers.add(20.3f);
        numbers.add(30.7f);
        numbers.add(40.1f);
        numbers.add(50.2f);
        Iterator<Float> iterator = numbers.iterator();
        float sum = 0.0f;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("The sum of the numbers in the list is: " + sum);
    }
}
