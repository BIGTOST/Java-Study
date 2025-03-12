package objects_and_APIs.abstraction_shapes;

public abstract class Shape
{
    abstract double calculateArea();

    public void print()
    {
        System.out.println("I am a Shape.");
    }
}
