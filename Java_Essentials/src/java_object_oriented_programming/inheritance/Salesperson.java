package java_object_oriented_programming.inheritance;

public class Salesperson extends Employee{

    private double comissionPercentage;

    public Salesperson() {
    }

    public Salesperson(double comissionPercentage) {this.comissionPercentage = comissionPercentage;
    }

    public Salesperson(String name, double salary, int age, double comissionPercentage) {
        super(name, salary, age);
        this.comissionPercentage = comissionPercentage;
    }

    public double getComissionPercentage() {
        return comissionPercentage;
    }

    public  void  raiseCommission(){
        if(this.comissionPercentage<.30)
        {
            this.comissionPercentage *= 1.2;
        }
    }
}
