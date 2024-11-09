package ExecutorServicesWithCallable;

import java.util.concurrent.Callable;

public class Gmail implements Callable <String>{
    private int id;
    private String name;
    private String email;
    Gmail(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String call(){

        return email;
    }
}
