package objects_and_APIs.inheritance;

public class Employee extends Person
{
    private String employeeId;
    private String title;

    public Employee()
    {
        super("John   ");
        System.out.println("In Employee default constructor");
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
