package ExecutorServicesWithRunnable;

public class Number implements Runnable {
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("This is run "+ Thread.currentThread().getName()+" "+i);
        }
    }
}
