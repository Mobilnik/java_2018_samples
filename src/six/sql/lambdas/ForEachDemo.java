package six.sql.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("d");
        strings.add("e");
        strings.add("a");
        strings.add("s");

        strings.forEach(s -> System.out.println(s)); //Consumer: Object -> void
        //или
        //strings.forEach(System.out::println);
        //а что такое out-то? а то юзаем, юзаем ...
    }
}
