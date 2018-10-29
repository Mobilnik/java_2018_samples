package six.sql.nestedclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonimousOuterClass {

    void showAnonimousClassUsage(){
        List<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("d");
        strings.add("e");
        strings.add("a");
        strings.add("s");
        System.out.println("Unsorted");
        System.out.println(strings.toString());
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //показать, что внутри
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted");
        System.out.println(strings.toString());
        //и это подводит нас к лямбда-выражениям
    }
}

class AnonimousDemo{
    public static void main(String[] args) {
        AnonimousOuterClass outer = new AnonimousOuterClass();
        outer.showAnonimousClassUsage();
    }
}