package objects_and_APIs.collection;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Sets
{
    public static void main(String[] args)
    {
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Lime");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits);
        System.out.println("Have lime?" + fruits.contains("lime"));

        fruits.remove("lemon");
        System.out.println("Number of elements after removing lemon: "+fruits.size() );
    }
}
