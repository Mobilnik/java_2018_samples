package nine.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFutures {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        System.out.println(Runtime.getRuntime().availableProcessors());
        Future<String> stringFuture = es.submit(() -> "Hello, I'm a string future");
        System.out.println(stringFuture.get());


    }
}
