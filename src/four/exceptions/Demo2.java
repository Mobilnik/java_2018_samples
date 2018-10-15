package four.exceptions;

import animals.Animal;

public class Demo2 {

    public static void main(String[] args) {
        //tryCatchDemo();
        System.out.println(tryCatchFinallyDemo());
    }

    private static void tryCatchDemo() {
        Animal animal = null;
        try {
            animal.toString();
        } catch (NullPointerException npe) {
            System.out.println("hello from catch block");
        }

        //animal.toString(); //очевидно, NPE
    }

    private static String tryCatchFinallyDemo() {
        Animal animal = null;
        try {
            animal.toString();
        } catch (NullPointerException ex) {
            System.out.println("hello from catch block");
            return "hello from catch block (returned)"; //вызовется, если закомментить return в finally
            //рассказать об очередности catch-блоков
        } finally {
            System.out.println("hello from finally block");
            return "hello from finally block (returned)";//вернется в любом случае.
        }
        //return "OK?"; // недостижимо.
    }
}