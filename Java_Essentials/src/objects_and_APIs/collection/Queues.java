package objects_and_APIs.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues
{
    public static void main(String[] args)
    {
        Queue fruits =  new LinkedList();
        fruits.add("apple");
        fruits.add("Melon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Melon");

        var removedFruit = fruits.remove();

        System.out.println(fruits);
        System.out.println("removed: ");

        System.out.println("Head of queue: " + fruits.peek());


    }
}
