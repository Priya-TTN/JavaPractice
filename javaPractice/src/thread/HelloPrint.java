package thread;

public class HelloPrint implements Runnable {
    int i;
    public HelloPrint(int i){
        this.i = i;
    }
    public void run(){
        System.out.println("Number: " +i + Thread.currentThread().getName());
    }
//    public void run(){
//
//    }
}
