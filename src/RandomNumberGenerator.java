import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer randomInt = random.nextInt();
        System.out.println("Random number generated. " + randomInt + " " +
                "THREAD: " + Thread.currentThread().getName());
        return randomInt;
    }
}
