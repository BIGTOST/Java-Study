package objects_and_APIs.exceptions;

public class ThrowingExceptions
{
    public static double calculatePay(double hours, double payRate) throws NegativeInputException
    {
        if(hours > 40){
            throw new IllegalArgumentException("Hours mus be less than or equal to 40");
        }

        if(hours<0 || payRate<0)
        {
            throw new NegativeInputException();
        }

        return hours*payRate;
    }
}
