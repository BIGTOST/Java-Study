package java_object_oriented_programming.challenges.reduce_redundant_code;

import java.util.ArrayList;

/*
 ? create the geUsingMod: method that takes in an index and retrieves an
 ? item from the list at that index
 ?
 ? if the index in invalid, then the mod and absolute value operations should
 ? be used to make index positive
 ? and mod the index based on the length of the list
 */
public class ModArrayList<T> extends ArrayList<T>
{

    public T getUsingMod(int index)
    {
        int validIndex = Math.abs(index % this.size());
        return this.get(validIndex);
    }
}
