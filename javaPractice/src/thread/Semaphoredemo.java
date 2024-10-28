import java.util.concurrent.Semaphore;

public class Semaphoredemo {
    public static void main(String[] args) {
       
        Semaphore parkingLot = new Semaphore(3);
        for (int i = 1; i <= 6; i++) {
            new Thread(new Car(parkingLot), "Car " + i).start();
        }
    }
    static class Car implements Runnable {
        private final Semaphore parkingLot;

        Car(Semaphore parkingLot) {
            this.parkingLot = parkingLot;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " trying to enter the parking lot.");
                
                // Acquire a permit to park
                parkingLot.acquire();
                System.out.println(Thread.currentThread().getName() + " parked.");
                
                // Simulate parking time
                Thread.sleep((long) (Math.random() * 5000));
                
                System.out.println(Thread.currentThread().getName() + " is leaving the parking lot.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                // Release the permit, making it available for other cars
                parkingLot.release();
            }
        }
    }
}
