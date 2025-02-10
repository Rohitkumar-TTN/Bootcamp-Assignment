interface A {
    default void show() {
        System.out.println("Default method from Interface A");
    }
}
interface B {
    default void show() {
        System.out.println("Default method from Interface B");
    }
}
class C implements A, B {
    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Overridden method in Class C");
    }
}
 class MultipleInheritanceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
