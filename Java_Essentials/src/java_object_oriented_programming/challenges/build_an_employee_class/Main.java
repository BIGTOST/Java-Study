package java_object_oriented_programming.challenges.build_an_employee_class;

import java.util.Scanner;

/*
 ? CHALLENGE: In the method we must:
 ?  -Build two Employee instances
 ?  -Give one Employee a raise
 ?  -Display the salaries of both Employees
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        String name, age, location;
        int salary;

        Employee employeeUm, employeeDois;

        System.out.print("Introduce the Name of the first Employee: ");
        name = scanf.next();
        System.out.print("Introduce the Age of the first Employee: ");
        age = scanf.next();
        System.out.print("Introduce the Salary of the first Employee: ");
        salary = scanf.nextInt();
        System.out.print("Introduce the Location of the first Employee: ");
        location = scanf.next();

        employeeUm = new Employee(name, age, salary, location);

        System.out.print("Introduce the Name of the Second Employee: ");
        name = scanf.next();
        System.out.print("Introduce the Age of the Second Employee: ");
        age = scanf.next();
        System.out.print("Introduce the Salary of the Second Employee: ");
        salary = scanf.nextInt();
        System.out.print("Introduce the Location of the Second Employee: ");
        location = scanf.next();

        scanf.close();
        employeeDois = new Employee(name, age, salary, location);

        System.out.println(
                "Salary of Employe One: " +
                employeeUm.getSalary() +
                "\n Salary of Employee Dois: " +
                employeeDois.getSalary()
        );

        employeeDois.raiseSalary(250);


        System.out.println(
                "Salary of Employe One: " +
                employeeUm.getSalary() +
                "\n Salary of Employee Dois: " +
                employeeDois.getSalary()
        );

    }
}
