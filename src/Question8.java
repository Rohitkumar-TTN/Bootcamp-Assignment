class TestClass {
    public void display() {
        System.out.println("Hello from TestClass");
    }
}






public class Question8 {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.display();
    }
}
//for class Not found exception
class ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
