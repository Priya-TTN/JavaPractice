import java.util.Random;
import java.util.stream.Stream;

public class RandomStockSellAndBuy {

    private static final Random random = new Random();

    public static void main(String[] args) {
        Stream<Double> stockStream = Stream.generate(() -> generateRandomStockPrice());
        stockStream.forEach(price -> processStockTransaction(price));
    }
    private static double generateRandomStockPrice() {
        return 50 + random.nextDouble() * 50; 
    }
    private static void processStockTransaction(double price) {
        static boolean stockflag = false;
        System.out.printf("Current Stock Price: ", price);
        if (price > 90 && stockflag) {
            stockflag = false;
            System.out.println("SELL: Stock sold!");
        }
        if (price < 70 && !stockflag) {
            stockflag = true; 
            System.out.println("BUY: Stock bought!");
        }
    }
}
