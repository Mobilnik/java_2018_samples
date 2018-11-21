package nine.multithreading;

import java.util.stream.IntStream;

public class DemoJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> IntStream.range(1, 101)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + " " + i)));
        Thread t2 = new Thread(() -> IntStream.range(1, 101)
                .forEach(i -> System.out.println(Thread.currentThread().getName() + " " + i)));
        t1.start();
        //t2.start();
        t1.join();
        t2.start();
    }
}
