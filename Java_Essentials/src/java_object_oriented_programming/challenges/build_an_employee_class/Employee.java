package java_object_oriented_programming.challenges.build_an_employee_class;

/*
 ? Task: Create an Employee class
 ?  -Attributes:
 ?              name
 ?              age
 ?              salary
 ?              location
 ?  -Behavior:
 ?             raiseSalary
 */
public class Employee
{
    /*
    * Solution fields
    * String name;
    * String location //? can be an Enum to limitate the locations
    * double salary;
    * int age;
    */
    private String name;
    private String age;
    private int salary;
    private String location;

    public Employee() {
        this.name = "";
        this.age = "0";
        this.salary =0;
        this.location = "Unknown";
    }

    public Employee(String name, String age, int salary, String location)
    {
        this.name = name;
        this.age = age;
        if(salary > 0)
            this.salary = salary;
        else
            this.salary = 0;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setLocation(String location) {
        this.location = location;
    }


    public void raiseSalary(int raiseValue)
    {
        this.salary += raiseValue;
    }


}
