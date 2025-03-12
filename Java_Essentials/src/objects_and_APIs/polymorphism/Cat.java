package objects_and_APIs.polymorphism;

public class Cat extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Meow");
    }

    public void scratch()
    {
        System.out.println("I am a cat. I scratch things");
    }
}
