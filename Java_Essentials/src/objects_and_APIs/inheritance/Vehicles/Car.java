package objects_and_APIs.inheritance.Vehicles;

public class Car extends Vehicle
{
    private int doors;

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }
}
