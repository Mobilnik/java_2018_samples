package four.collections;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //additionDemo();
        //deletionDemo();
        iterationDemo();
    }

    private static void additionDemo() {
        Animal murka = new Animal("Murka", 3, "Cat");
        Animal bobik = new Animal("Bobik", 5, "Dog");
        Animal buryonka = new Animal("Buryonka", 10, "Cow");
        Animal barsik = new Animal("Barsik", 5, "Cat");

        Map<String, Animal> animalByNames = new HashMap<>();
        animalByNames.put(murka.getName(), murka);
        animalByNames.put(bobik.getName(), bobik);
        animalByNames.put(buryonka.getName(), buryonka);
        animalByNames.put(barsik.getName(), barsik);
        System.out.println(animalByNames.size());
        System.out.println(animalByNames.toString());


        Map<String, Animal> animalBySpecies = new HashMap<>();
        animalBySpecies.put(murka.getSpecies(), murka);
        animalBySpecies.put(bobik.getSpecies(), bobik);
        animalBySpecies.put(buryonka.getSpecies(), buryonka);
        animalBySpecies.put(barsik.getSpecies(), barsik);
        System.out.println(animalBySpecies.size());
        System.out.println(animalBySpecies.toString());
    }

    private static void deletionDemo() {
        Map<String, Animal> animals = initAnimalsMap();
        System.out.println(animals.size());
        System.out.println(animals.toString());

        animals.remove("Murka");
        System.out.println(animals.size());
        System.out.println(animals.toString());

        animals.clear(); // empty
        System.out.println(animals.toString());
    }

    private static Map<String, Animal> initAnimalsMap() {
        Animal murka = new Animal("Murka", 3, "Cat");
        Animal bobik = new Animal("Bobik", 5, "Dog");
        Animal buryonka = new Animal("Buryonka", 10, "Cow");
        Animal barsik = new Animal("Barsik", 5, "Cat");

        Map<String, Animal> animalByNames = new HashMap<>();
        animalByNames.put(murka.getName(), murka);
        animalByNames.put(bobik.getName(), bobik);
        animalByNames.put(buryonka.getName(), buryonka);
        animalByNames.put(barsik.getName(), barsik);
        return animalByNames;
    }

    private static void iterationDemo() {
        Map<String, Animal> animals = initAnimalsMap();
        for(Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toString());
        }
    }
}
