import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class IOInput
{

   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("The name of the file: ");
      String fileName = scan.nextLine();
      File file = new File(fileName);
      PrintWriter out = new PrintWriter(file);
      System.out.println("New friend: ");
      String string = scan.nextLine();
      while (!(string.equals("QUIT")))
      {
         System.out.println("New friend: ");
         out.println(string);
         string = scan.nextLine();

      }
      out.close();
      scan.close();
   }

}
