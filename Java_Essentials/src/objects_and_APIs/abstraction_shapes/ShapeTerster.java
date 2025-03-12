package objects_and_APIs.abstraction_shapes;

public class ShapeTerster
{
    public static void main(String[] args)
    {
        Shape rectangle =  new Rectangle(5,7);

        System.out.println(rectangle.calculateArea()
        );
    }
}
