@FunctionalInterface
interface Compare {
    boolean isGreater(int a, int b);
}
@FunctionalInterface
interface Increment {
    int incrementByOne(int num);
}
@FunctionalInterface
interface Concatenate {
    String concat(String s1, String s2);
}


@FunctionalInterface
interface ToUpperCase {
    String convert(String str);
}
class LambdaExample {
    public static void main(String[] args) {
        Compare compare = (a, b) -> a > b;
        System.out.println(compare.isGreater(10, 5));


        Increment increment = num -> num + 1;
        System.out.println(increment.incrementByOne(5));


        Concatenate concatenate = (s1, s2) -> s1 + s2;
        System.out.println(concatenate.concat("Hello, ", "World"));


        ToUpperCase toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.convert("hello"));
    }
}
