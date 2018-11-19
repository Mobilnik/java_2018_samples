package nine.multithreading;

import java.util.concurrent.atomic.AtomicLong;

public interface Counter {
    //long counter = 0;//неявно final, нельзя изменять.
    long inc();
}

class SimpleCounter implements Counter {
    long counter;

    @Override
    public long inc() {
        return counter++;
    }
}

class Demo {
    public void calculateResult(Counter counter) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; ++i)
                counter.inc();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; ++i)
                counter.inc();
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}


class DemoSimpleCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new SimpleCounter();
        Demo demo = new Demo();
        demo.calculateResult(counter);

        System.out.println(((SimpleCounter) counter).counter);//что выведет?

        //чтение int атомарно. Исправление на int должно пофиксить?
    }
}











class AtomicCounter implements Counter {
    AtomicLong counter = new AtomicLong(0);

    @Override
    public long inc() {
        return counter.getAndIncrement();
    }
}


class DemoAtomicCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new AtomicCounter();
        Demo demo = new Demo();
        demo.calculateResult(counter);

        System.out.println(((AtomicCounter) counter).counter);//что выведет?
    }
}















class LockCounter implements Counter {
   long counter = 0;

    @Override
    public synchronized long inc() {
        return counter++;
    }
}



class DemoLockCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new LockCounter();
        Demo demo = new Demo();
        demo.calculateResult(counter);

        System.out.println(((LockCounter) counter).counter);//что выведет?
    }
}
