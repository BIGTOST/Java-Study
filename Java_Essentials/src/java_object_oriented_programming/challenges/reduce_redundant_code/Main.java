package java_object_oriented_programming.challenges.reduce_redundant_code;

public class Main
{
    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        listy.getUsingMod(1);
        listy.getUsingMod(45);
        listy.getUsingMod(-10);
    }
}
