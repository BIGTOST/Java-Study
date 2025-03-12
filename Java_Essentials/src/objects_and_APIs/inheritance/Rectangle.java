package objects_and_APIs.inheritance;

public class Rectangle
{
    protected double length;
    protected double width;
    protected double sides =4;


    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }
    public double getSides() {
        return sides;
    }
    public double getWidth() {
        return width;
    }

    public double calculatePerimeter()
    {
        return (2*length)+(2*width);
    }

    public void print(){
        System.out.println("Im a rectagle");
    }
}
