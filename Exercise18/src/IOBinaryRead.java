import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class IOBinaryRead
{
   public static void main(String[] args)  
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the file name? ");
      ObjectInputStream in = null;
      String fileName = scan.nextLine();
      File file = new File(fileName);
      try {
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);

         int count = in.readInt();
         for (int i = 0; i < count; i++)
         {
            int intValue = in.readInt(); 
            System.out.println(intValue);
         }
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
      scan.close();
   }
}
