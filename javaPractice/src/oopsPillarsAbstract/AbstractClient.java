package oopsPillarsAbstract;

public class AbstractClient {
    public static void main(String[] args) {
        AbtractClassDemo dog = new Dog("German Shefard");
        System.out.println("Dog name"+" "+dog.getName());
        dog.Walk();
    }
}
