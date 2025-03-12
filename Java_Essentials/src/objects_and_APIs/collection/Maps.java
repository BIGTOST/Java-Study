package objects_and_APIs.collection;

import java.util.HashMap;
import java.util.Map;

public class Maps
{

    public static void main(String[] args)
    {
        Map fruitCalories = new HashMap();

        fruitCalories.put("Apple",95);
        fruitCalories.put("Lime",20);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Oragen",45);
        fruitCalories.put("Lime",56);//? override the value of the key "lime"
        fruitCalories.putIfAbsent("Lemon",60); //? if there are no "Lemon" key adds this key-value par

        System.out.println(fruitCalories);
        System.out.println("Banana:"+fruitCalories.get("banana"));
    }

}
