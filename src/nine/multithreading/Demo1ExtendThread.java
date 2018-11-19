package nine.multithreading;

//способ 1
class MyThread1 extends Thread {

    private int i;

    public MyThread1() {

    }

    public MyThread1(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + i + ".");
    }

}

public class Demo1ExtendThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread1();
        Thread t3 = new MyThread1();

        t1.start();
        t2.start();
        t3.start();
    }
}

class Demo2ExtendThread {
    public static void main(String[] args) {
        Thread t1 = new MyThread1(1);
        Thread t2 = new MyThread1(2);
        Thread t3 = new MyThread1(3);

        //порядок не гарантируется, как видим, будет нелегко!
        t1.start();
        t2.start();
        t3.start();
    }
}