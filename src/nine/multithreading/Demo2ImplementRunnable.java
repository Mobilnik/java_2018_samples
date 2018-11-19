package nine.multithreading;

//способ 1
class MyRunnable implements Runnable {
    private int i;

    public MyRunnable() {

    }

    public MyRunnable(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Hello.");
    }
}

public class Demo2ImplementRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(100));
        Thread t2 = new Thread(() -> System.out.println("Hello from lambda."));
        Thread t3 = new Thread(() -> System.out.println("Hello from lambda 2."));
        t1.start();
        t2.start();
        t3.start();
        //а если так?
        //t1.start();





        //внутреннее состояние изменилось, как его можно перезапустить?
    }
}
