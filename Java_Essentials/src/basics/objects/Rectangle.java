package basics.objects;

public class Rectangle
{
     private double length;
    private double width;


    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

     public double calculatePerimeter()
     {
         return (2 * this.length)+ (2 * this.width);
     }
     public double calculateArea()
     {
         return this.length * this.width;
     }

     public double getLength()
     {
         return this.length;
     }
     public double getWidth()
     {
         return this.width;
     }

     public void setLength(double length)
     {
         this.length = length;
     }
     public void setWidth(double width)
     {
        this.width = width;
     }
}
