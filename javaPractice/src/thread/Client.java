package thread;

public class    Client{
    public static void main(String[] args) {
        Runnable x;
//        x.run();
        for(int i=0; i<=100; i++) {
            x = new HelloPrint(i);
            Thread t = new Thread(x);
            t.start();
        }
    }
}

