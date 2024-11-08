package oopsPillarsAbstract;

abstract public class AbtractClassDemo {
    String name;
    AbtractClassDemo(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    abstract void Walk();
}
