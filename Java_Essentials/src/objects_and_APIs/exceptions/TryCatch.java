package objects_and_APIs.exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch
{
    public static void main(String[] args)
    {
        File file = new File("aaaaa/aaaaa.txt");
        try {
            file.createNewFile();
        }
        catch (IOException err)
        {
            System.out.println(err.getMessage());
            err.getStackTrace();
        }
    }
}
