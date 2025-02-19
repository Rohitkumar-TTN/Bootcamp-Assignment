// Q4)-WAP to return a random integer value from a thread execution using Future.

import java.util.concurrent.*;
import java.util.Random;

class RandomNumberTask implements Callable<Integer> {
    @Override
    public Integer call() {
        return new Random().nextInt(100);
    }
}

public class Question4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new RandomNumberTask());

        System.out.println("Random Number: " + future.get());

        executor.shutdown();
    }
}
