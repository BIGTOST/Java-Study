package objects_and_APIs.inheritance;

public class Square extends Rectangle
{
    @Override
    public double   calculatePerimeter()
    {
        return sides * length;
    }

    public void print(String text)
    {
        System.out.println("Im a " + text);
    }
}
