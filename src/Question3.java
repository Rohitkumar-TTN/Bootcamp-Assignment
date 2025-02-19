/*Q3)- Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
        to submit a list of tasks and wait for completion of all tasks*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            tasks.add(() -> "Task " + taskNum + " completed by " + Thread.currentThread().getName());
        }
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("SingleThreadExecutor:");
        for (Future<String> result : singleThreadExecutor.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        singleThreadExecutor.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("\nCachedThreadPool:");
        for (Future<String> result : cachedThreadPool.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        cachedThreadPool.shutdown();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        System.out.println("\nFixedThreadPool:");
        for (Future<String> result : fixedThreadPool.invokeAll(tasks)) {
            try { System.out.println(result.get()); } catch (ExecutionException e) { e.printStackTrace(); }
        }
        fixedThreadPool.shutdown();
    }
}
