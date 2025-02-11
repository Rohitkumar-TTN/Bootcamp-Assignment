interface example{
    void x();
    static void staticmethod(){
        System.out.println("In Static method");
    }
    default void defaultmethod(){
        System.out.println("In Default method");
    }
}

public class Question2{
    public static void main(String[] args) {
        example.staticmethod();
        example y=System.out::println;
        y.defaultmethod();

    }
}
//@FunctionalInterface
// interface example{
//    void x();
//    static void staticmethod(){
//        System.out.println("In static method");
//    }
//    default void defualtmethod(){
//        System.out.println("In default method");
//    }
//        }
//
//public class Question2 {
//    public static void main(String[] args) {
//        example s=example::staticmethod;
//        s.defualtmethod();
//        s.x();
// }
//}
