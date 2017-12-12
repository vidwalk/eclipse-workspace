import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class IOBinaryWrite
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the file name? ");
      ObjectOutputStream out = null;
      String fileName = scan.nextLine();
      File file = new File(fileName);
      try {
         
         FileOutputStream fout = new FileOutputStream(file);
         out = new ObjectOutputStream(fout);
         out.writeInt(11);
         for (int i = 0; i < 11; i++)
         {
            out.writeInt(i);
            out.writeDouble(Math.pow(i, 2));
         }
      }
      catch(IOException e)
      {
         System.out.println("Exception: " + fileName);
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
      scan.close();
   }
}
