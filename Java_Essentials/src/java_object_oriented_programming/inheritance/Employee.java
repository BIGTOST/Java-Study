package java_object_oriented_programming.inheritance;

public class Employee
{
    private String name;
    protected double salary;
    private int age;

    public Employee() {
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
