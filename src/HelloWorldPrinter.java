public class HelloWorldPrinter implements Runnable {
    //Task Class.
    @Override
    public void run() {
        //What work we want to do in a separate thread, that will come here.
        System.out.println("Hello World. THREAD: " +
                Thread.currentThread().getName());
        System.out.println("lokesh's commit ");
    }
}
