package task2.RateLimitedPrinter;

public class RateLimitedPrinter {

    private int interval;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) throws InterruptedException {
        Thread.sleep(this.interval);
        System.out.println(message);
    }
}
