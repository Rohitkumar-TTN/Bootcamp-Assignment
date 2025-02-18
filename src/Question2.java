class SynchronizedExample implements Runnable {
    int x = 0;

    @Override
    public void run() {
        increment();
        decrement();
    }

    synchronized public void increment() {
        for (int i = 0; i < 100; i++) {
            x++;
        }
        System.out.println(Thread.currentThread().getName() + " - Incremented: " + x);
    }

    public void decrement() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                x--;
            }
            System.out.println(Thread.currentThread().getName() + " - Decremented: " + x);
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        Thread t1 = new Thread(example);
        Thread t2 = new Thread(example);

        t1.start();
        t2.start();
    }
}

