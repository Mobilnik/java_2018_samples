package four.collections;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //List<Animal> animals = new ArrayList<>();
        //почему не ArrayList<Animal> animals = new ArrayList<>();

        listAddDemo();
    }

    private static void listAddDemo() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list.toString());

        list.set(1, "two");
        System.out.println(list.toString());

        list.add(1, "1.5");
        //так, чтобы индекс добавляемого элемента стал 1
        //все, что раньше (индекс 0), не трогаем.
        System.out.println(list.toString());


        //удалили элемент с индексом 0
        list.remove(0);
        System.out.println(list.toString());

        //list.remove(100);//IndexOutOfBoundsException
        System.out.println(list.toString());

        //удалить все
        list.removeAll(list);
        System.out.println(list.toString());

    }
}
