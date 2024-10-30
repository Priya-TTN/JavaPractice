import java.util.function.Function;

public class ConstructorReference {
    public static void main(String[] args) {
        Function<String, Person> personFactory = Person::new;
        Person person = personFactory.apply("Priya");
        System.out.println(person); 
    }
}
