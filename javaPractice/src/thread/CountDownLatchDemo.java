package thread;
import java.util.concurrent.CountDownLatch;
public class CountDownLatchDemo {

    public static void main(String[] args) {
        int numberOfTasks = 3;
        CountDownLatch latch = new CountDownLatch(numberOfTasks);

        for (int i = 1; i <= numberOfTasks; i++) {
            new Thread(new Task(latch), "Task " + i).start();
        }

        try {
            System.out.println("Main thread waiting for tasks to complete.");
            latch.await(); // Wait for count to reach zero
            System.out.println("All tasks are completed. Main thread continues.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static class Task implements Runnable {
        private final CountDownLatch latch;

        Task(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is performing a task.");
            try {
                // Simulate task work
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                latch.countDown(); // Decrement latch count
                System.out.println(Thread.currentThread().getName() + " has completed its task.");
            }
        }
    }
}
