// Q1)-WAP to show usage of Callable and demonstrate how it is different from Runnable
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable task executed.");
            }
        };
        executor.submit(runnableTask);

        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable task executed.";
            }
        };
        Future<String> future = executor.submit(callableTask);
        System.out.println(future.get());

        executor.shutdown();
    }
}
