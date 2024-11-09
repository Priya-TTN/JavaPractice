package ExecutorServicesWithRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Number nb = new Number();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i<10; i++){
            executorService.execute(nb);
        }
    }
}
