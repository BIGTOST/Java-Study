package basics.methods;

import java.util.Scanner;

/*
 ? OUR FIRST METHOD
 ? Write a method that greets a user by name
 */

public class Greetings
{
    public static void main(String[] args)
    {
        greetUser();
    }

    public static void greetUser()
    {
        Scanner scanf = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = scanf.next();
        scanf.close();
        System.out.println("Hi there, " +name);
    }

}
