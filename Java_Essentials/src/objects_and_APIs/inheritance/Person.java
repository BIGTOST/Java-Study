package objects_and_APIs.inheritance;

public class Person
{
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("In Person default constructor");
    }

    public Person(String name)
    {
        System.out.println("In the second constructoer");
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
}
