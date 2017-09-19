import java.util.Scanner;
public class NameTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What's your name? ");
      String namerino = scan.nextLine();
      Name name = new Name(namerino);
      System.out.println("Your full name is " + name.getFullName());
      System.out.println("Your formal name is " + name.getFormalName());
      System.out.println("Your formal name is " + name.getFirstName());
      scan.close();
   }

}
