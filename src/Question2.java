@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
}
 class MethodReferenceExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation addition = calculator::add;
        Operation subtraction = calculator::subtract;
        Operation multiplication = Calculator::multiply;
        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
    }
}

