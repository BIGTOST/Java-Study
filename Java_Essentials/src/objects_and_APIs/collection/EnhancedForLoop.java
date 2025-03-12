package objects_and_APIs.collection;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}
