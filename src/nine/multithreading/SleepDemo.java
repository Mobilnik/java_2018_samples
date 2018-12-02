package nine.multithreading;

public class SleepDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1_000_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //закрыть ресурсы
            }
        });
        t1.start();

        Thread.sleep(100);
        t1.interrupt();
    }
}
