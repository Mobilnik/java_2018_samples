package four.generics;

import animals.Animal;
import animals.Dog;

class Demo3<T extends Animal> {
}

class Demo4<T extends Dog> {
}

class Demo5{
    public static void main(String[] args) {
        //Demo4<Object> objects;//ошибка компиляции
        Demo4<Dog> dogs;
        Demo3<Dog> dogAnimals;
    }
}