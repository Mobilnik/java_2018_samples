package four.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionAndIteratorDemo {

    /*
     *public interface Collection<E>{
     *     boolean add(E element);
     *     Iterator<E> iterator();
     * }
     */

    /*
     *public interface Collection<E>{
     *     E next();
     *     boolean hasNext();
     *     void remove();
     * }
     */

    public static void main(String[] args) {
        basicIteratorDemo();
        //betterIteratorDemo();
        //improvedIteratorDemo();
        //bestIteratorDemo();

        //removalDemo();
        //worseRemovalDemo();
    }


    private static void basicIteratorDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator it = list.iterator();
        System.out.println("has next ? " + it.hasNext());
        System.out.println(it.next());
        System.out.println("has next ? " + it.hasNext());
        System.out.println(it.next());
        System.out.println("has next ? " + it.hasNext());
        //System.out.println(it.next()); //NoSuchElementException
    }

    private static void betterIteratorDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        for (Iterator it = list.iterator(); it.hasNext(); ) {
            String s = (String) it.next(); //приходится приводить
            System.out.println(s);
        }
    }

    private static void improvedIteratorDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    private static void bestIteratorDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        //при компиляции преобразуется в список с итератором, как выше
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void removalDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.toString());
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            //it.remove(); //ошибка IllegalStateException
            it.next();
            it.remove(); //ок
            // it.remove(); //ошибка IllegalStateException
        }
        System.out.println(list.toString());
    }

    private static void worseRemovalDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.toString());

        for (String s : list) {
            list.remove(s);
        }
        //ConcurrentModificationException
    }
}
