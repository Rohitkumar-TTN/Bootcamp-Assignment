class A implements Runnable{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Class A thread using runnable");
    };
}
class B extends Thread{
    public void run(){
        System.out.println("Class B thread using the Thread class");
    }
}
public class Question1 {
    public static void main(String[] args) {
        A runner=new A();
        Thread t1=new Thread(runner);
        t1.start();
        B t2=new B();
        t2.start();
        try{
            t2.join();
            t1.join();
        }catch (InterruptedException e){
            System.out.println("through the error message" + e.getMessage());
        }
        System.out.println("thread of the main");
    }
}
