package objects_and_APIs.inheritance.Vehicles;

public class Vehicle
{
    private String color;
    private int mileage;


    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }
}
