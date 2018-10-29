package six.sql.lambdas;

import java.util.ArrayList;
import java.util.List;

public class MyFunctionalInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        IntMultiplier multiplierWithPrint = (i) -> System.out.println(i * 3);

        ints.forEach(multiplierWithPrint::multiply);
    }
}


@FunctionalInterface
interface IntMultiplier {

    void multiply(Integer value);

    //можно и так, вот для чего еще нужны default-методы
    default void doSmth() {
        System.out.println("doing something");
    }

    //а вот так нельзя
    //Integer get();
}