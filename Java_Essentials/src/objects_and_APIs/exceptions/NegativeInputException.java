package objects_and_APIs.exceptions;

public class NegativeInputException extends Exception{

    public NegativeInputException(){
        this("Input must ne grater than or equal to 0");
    }

    public  NegativeInputException(String message)
    {
        super(message);
    }
}
