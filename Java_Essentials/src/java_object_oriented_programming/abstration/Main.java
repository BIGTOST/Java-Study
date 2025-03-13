package java_object_oriented_programming.abstration;

public class Main
{
    public static void main(String[] args) {
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        try {
            System.out.println(digitsOnlyFileReader.readFile());
        }catch (Exception err)
        {
            System.out.println(err);
        }
        System.out.println(digitsOnlyFileReader.getFilePath());
    }
}
