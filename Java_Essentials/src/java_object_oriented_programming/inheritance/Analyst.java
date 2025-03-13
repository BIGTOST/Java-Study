package java_object_oriented_programming.inheritance;

public class Analyst extends Employee
{

    public Analyst() {
    }

    public Analyst(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus() {
        return this.salary *.05;
    }
}
