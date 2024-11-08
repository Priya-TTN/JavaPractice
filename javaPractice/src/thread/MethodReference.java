package thread;
import java.util.function.Function;
public class MethodReference {
    public static Integer square(Integer number) {
        return number * number;
    }
  
public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = MethodReference::square;
        Integer result = squareFunction.apply(5);
        System.out.println(result); 
    }
}
