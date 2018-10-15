package four.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        demonstrateListWithoutGenerics();
        //demonstrateListWithGenerics();
    }

    @SuppressWarnings("")
    private static void demonstrateListWithoutGenerics() {
        List names = new ArrayList();
        names.add("Ivan");
        names.add("Mariya");
        names.add(Integer.parseInt("123"));

        for (Object name : names) {
            System.out.println(name);
            String nameStr = (String) name;
            System.out.println(nameStr.charAt(0));
        }
    }

    private static void demonstrateListWithGenerics() {
        //List<String> names = new ArrayList<String>();
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Mariya");
        //names.add(Integer.parseInt("123"));//Ошибка компиляции

        for (Object name : names) {
            String nameStr = (String) name;
            System.out.println(nameStr.charAt(0));
        }

        //можно еще лучше!
        for (String name : names){
            System.out.println(name.charAt(0));
        }
    }


}
