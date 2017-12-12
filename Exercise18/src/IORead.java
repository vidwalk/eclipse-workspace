import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IORead
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the file name? ");
      String fileName = scan.nextLine();
      File file = new File(fileName);
      Scanner inFile = new Scanner(file);
      while(inFile.hasNext())
      {
         System.out.println(inFile.nextLine());
      }
      inFile.close();
      scan.close();
   }
}
