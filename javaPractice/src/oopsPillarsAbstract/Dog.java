package oopsPillarsAbstract;

public class Dog extends AbtractClassDemo{
    Dog(String name) {
        super(name);
    }
    @Override
    void Walk() {
        System.out.println("< -- Dog Walk -- >");
    }
}
