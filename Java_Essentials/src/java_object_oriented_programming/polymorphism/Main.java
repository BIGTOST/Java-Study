package java_object_oriented_programming.polymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Main
{
    public static void addRandomNumber(ArrayList<Integer> list)
    {
        int originalSize = list.size();
        Random rand = new Random();
        int n = rand.nextInt(1000);
        if(list instanceof ConditionArrayList)
        {
            ConditionArrayList conditionArrayList = (ConditionArrayList) list;
            while (!conditionArrayList.isElegible(n))
            {
                n = rand.nextInt(1000);
            }
        }

        list.add(n);
    }
    public static void main(String[] args) {

        //*Compiling way
        ConditionArrayList oddListy = new ConditionArrayList(n-> Math.abs(n)%2==1);

        oddListy.add(1);
        oddListy.add(2);
        oddListy.add(3);;
        System.out.println(oddListy);
        addRandomNumber(oddListy);
        System.out.println(oddListy);
        System.out.println(oddListy.size());

        System.out.println();

        //* Run-Time way
        Predicate<Integer> isDivisibleByThree = n-> Math.abs(n) % 3 == 0;

        ConditionArrayList evenListy = new ConditionArrayList(
                isDivisibleByThree,
                1,2,3,4,5,6,9
        );
        evenListy.add(1);
        evenListy.add(2);
        evenListy.add(3);;
        System.out.println(evenListy);
        addRandomNumber(evenListy);
        System.out.println(evenListy);
        System.out.println(evenListy.size());

        System.out.println();

        ArrayList<Integer> listy = new ArrayList<>();

        listy.add(1);
        listy.add(2);
        listy.add(3);
        listy.add(4);
        listy.add(7);
        listy.add(9);
        listy.add(-13);
        System.out.println(listy);
        addRandomNumber(listy);
        System.out.println(listy);
        System.out.println(listy.size());

        ConditionArrayList divisibleByThreeListy = new ConditionArrayList(isDivisibleByThree, listy);

        Predicate<Integer> isDivisibleBySix = n->Math.abs(n) % 6 ==0;
        ConditionArrayList divisibleBySixListy = new ConditionArrayList(isDivisibleBySix, listy);
    }
}
