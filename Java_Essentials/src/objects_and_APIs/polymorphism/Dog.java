package objects_and_APIs.polymorphism;

public class Dog extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof");
    }

    public void fetch()
    {
        System.out.println("Fetch is fun");
    }
}
