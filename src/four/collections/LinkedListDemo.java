package four.collections;

import animals.Animal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Animal> list = new LinkedList<>();
        list.add(new Animal("barsik", 1, "Cat"));
        list.add(null); //null - value, но ссылки у ноды проставлены
        list.add(new Animal("buryonka", 10, "Cow"));
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
