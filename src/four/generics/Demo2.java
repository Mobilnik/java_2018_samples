package four.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        //вместо T подставили Integer
        Pair<Integer> pair1 = new Pair<>(0, 1);
        Pair<Integer> pair2 = new Pair<>(1, 2);

        List<Pair> pairs = new ArrayList<>();
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(new Pair<String>("My", "Pair"));//подстава!

        List<Pair<Integer>> betterPairs = new ArrayList<>();
        //betterPairs.add(new Pair<String>("My", "Pair")); //ошибка компиляции
    }
}
