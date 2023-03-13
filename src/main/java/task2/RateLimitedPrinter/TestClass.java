package task2.RateLimitedPrinter;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(1000);
        for (int i = 0; i < 1_000_000_000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }
        long currentTime = System.currentTimeMillis();
    }
}
