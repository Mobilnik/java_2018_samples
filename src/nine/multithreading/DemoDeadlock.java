package nine.multithreading;


class A {
}

class B {
}


public class DemoDeadlock {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("T1 acquired lock on a");
                try {
                    Thread.sleep(5_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1 tries to acquire lock on b");
                synchronized (b) {
                    System.out.println("T1 acquired lock on b");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("T2 acquired lock on b");
                try {
                    Thread.sleep(5_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T2 tries to acquire lock on a");
                synchronized (a) {
                    System.out.println("T2 acquired lock on a");
                }
            }
        });

        t1.start();
        t2.start();
    }
}