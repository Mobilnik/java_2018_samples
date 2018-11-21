package nine.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFutures {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        //System.out.println(Runtime.getRuntime().availableProcessors());
        Future<String> stringFuture1 = es.submit(() -> "Hello, I'm a string future 1");
        Future<String> stringFuture2 = es.submit(() -> "Hello, I'm a string future 2");

        System.out.println(stringFuture2.get());
        System.out.println(stringFuture1.get());
    }
}
