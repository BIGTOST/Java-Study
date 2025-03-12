package basics.objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods
{
    static Scanner scanf = new Scanner(System.in);

    public static void main(String[] args)
    {

        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        System.out.println("The total area is:"+calculateTotalArea(kitchen, bathroom));
        scanf.close();
    }

    public static double calculateTotalArea(Rectangle rectangleOne, Rectangle rectangleTwo)
    {
        return rectangleOne .calculateArea() + rectangleTwo.calculateArea();
    }

    public static Rectangle getRoom()
    {
        double length,
                width;
        System.out.println("Enter the length of your room: ");
        length = scanf.nextDouble();

        System.out.println("Enter the width of your room " );
        width = scanf.nextDouble();

        return new Rectangle(length,width);
    }
}
