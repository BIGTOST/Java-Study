package objects_and_APIs.collection;

import java.util.ArrayList;
import java.util.List;

public class Lists
{
    public static void main(String[] args)
    {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Lime");
        fruits.add("banana");
        fruits.set(2,"orange");
        fruits.add("lemon");


        System.out.println(fruits);
        System.out.println(fruits.get(2 ));
        System.out.println("Index of first lime:" + fruits.indexOf("lemon"));
        System.out.println("Index of first lime:" + fruits.lastIndexOf("lemon"));


        List moreFruits = List.of("Roman", "Grape","Benjery");
    }
}
