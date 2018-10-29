package six.sql.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("d");
        strings.add("e");
        strings.add("a");
        strings.add("s");

        List<String> filteredAndMappedStrings = strings.stream() //а что такое stream? Типизирован?
                .filter(s -> s.equals("b")) //Predicate Object -> boolean, метод test()
                .map(s -> s.toUpperCase()) // Function Object -> Object
                .collect(Collectors.toList()); //терминальная операция collect
        System.out.println(filteredAndMappedStrings.toString());


        //reduce demo
        System.out.println(strings.stream()
                .reduce((s1,s2) -> s1 + s2)
                .get());

        strings.stream().allMatch(s -> s != null);
        //System.out.println(); // а что-нибудь изменится?


    }
}
