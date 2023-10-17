import javax.swing.plaf.TableHeaderUI;
import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Hello world!, THREAD: " + Thread.currentThread().getName());
//
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread thread = new Thread(helloWorldPrinter);
//        thread.run();

//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 1; i <= 100; i++) {
//            if (i == 11 || i == 51 || i == 100) {
//                System.out.println("hello");
//            }
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executorService.submit(numberPrinter);
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        RandomNumberGenerator random1 = new RandomNumberGenerator();
        RandomNumberGenerator random2 = new RandomNumberGenerator();

        Future<Integer> randomNum1 = executorService.submit(random1);
        Future<Integer> randomNum2 = executorService.submit(random2);

        Integer num1 = randomNum1.get();
        Integer num2 = randomNum2.get();

        System.out.println("Sum of random numbers : " + (num1 + num2) +
                " THREAD: " + Thread.currentThread().getName());
    }
}