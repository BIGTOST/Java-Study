package basics.objects;

/*
 ? Write a class that creates instances of the 'Rectangles' class to find the
 ? total area of two rooms in a house
 */

public class HomeAreaCalculator
{
    public static void main(String[] args)
    {
        Rectangle roomOne = new Rectangle();

        roomOne.setWidth(25);
        roomOne.setLength(50);

        double areaOfRoomOne = roomOne.calculateArea();

        Rectangle roomTwo = new Rectangle(30,75);
        double areaOfRoomTwo = roomTwo.calculateArea();
    }
}
