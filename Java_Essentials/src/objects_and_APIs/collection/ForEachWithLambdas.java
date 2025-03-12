package objects_and_APIs.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas
{
    public static void printCollection_forEach() {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("Orange");

        fruit.forEach(fru  -> System.out.println(fru));
        fruit.forEach(System.out::println);//* simplified version of the forEach above
        fruit.forEach(fru -> {
            fru = "fruits: " + fru;
            System.out.println(fru);
        });
    }

    public static void printMap_forEach()
    {
        Map<String, Integer> fruitCalories = new HashMap<>();

        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);

        fruitCalories.forEach((k, val) ->{System.out.println(k + ": " + val);});
    }
    public static void main(String[] args)
    {
        //printCollection_forEach();
        printMap_forEach();
    }

}
