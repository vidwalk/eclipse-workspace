import java.util.Scanner;

public class genderTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Type the Age: ");
      int age = input.nextInt(); // Asks for the Age of the person
      input.nextLine(); // Absorbs the [Enter]
      System.out.print("Type gender (M or F): ");
      String line = input.nextLine(); // Asks user for his String input
      char gender = line.charAt(0);
      if (gender == 'M' && age >= 18)
      // System.out.print("Male"); //If it's a Male the program will print Male
      {
         System.out.println("Man");
      }
      else if (gender == 'M' && age < 18)
      {
         System.out.println("Boy");
      }
      else if (gender == 'F' && age >= 18)
      // System.out.print("Not a Male"); //If it's not a Male the program will
      // print Not a Male
      {
         System.out.println("Women");
      }
      else if (gender == 'F' && age < 18)
      {
         System.out.println("Girl");
      }
   }
}