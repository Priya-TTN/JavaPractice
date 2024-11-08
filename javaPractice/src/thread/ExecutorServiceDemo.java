package thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        Future<Integer> future1 = executorService.submit(new Task(5));
        Future<Integer> future2 = executorService.submit(new Task(10));
        Future<Integer> future3 = executorService.submit(new Task(15));

        try {
            // Retrieve results of the tasks
            System.out.println("Result of Task 1: " + future1.get());
            System.out.println("Result of Task 2: " + future2.get());
            System.out.println("Result of Task 3: " + future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executorService.shutdown();
        }
    }

    static class Task implements Callable<Integer> {
        private final int number;

        public Task(int number) {
            this.number = number;
        }

        @Override
        public Integer call() {
            return number * number; // Simple task: return the square of the number
        }
    }
}
