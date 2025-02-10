@FunctionalInterface
interface MyInterface {
    MyClass create(String msg);
}
class MyClass {
    private String message;
    MyClass(String msg) {
        this.message = msg;
        System.out.println("Constructor called with message- " + message);
    }
    public String getMessage() {
        return message;
    }
}
class ConstructorReferenceExample {
    public static void main(String[] args) {
        MyInterface ref = MyClass::new;
        MyClass obj = ref.create("This is Constructor Reference");
        System.out.println("Message- " + obj.getMessage());
    }
}
