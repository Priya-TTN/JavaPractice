package ExecutorServicesWithCallable;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception{
        Gmail gmail = new Gmail(2,"Priya","priya.gupta@ttn.com");
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> futureObj =  executorService.submit(gmail);
        System.out.println(" This is for other task ");
        System.out.println(" This is for other task 2");
        String qa = futureObj.get();
        System.out.println(" This is for other task 3 "+ qa);
        executorService.shutdown();
    }


}
