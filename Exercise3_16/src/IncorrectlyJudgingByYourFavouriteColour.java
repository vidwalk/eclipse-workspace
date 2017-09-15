import java.util.Scanner;

public class IncorrectlyJudgingByYourFavouriteColour
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Choose between black, white, red, or blue: ");
      String colorPreference = scan.nextLine();
      colorPreference = colorPreference.toUpperCase();
      switch(colorPreference)
      {
         case "BLACK":
            
            System.out.println("You must be a Goth!");
            break;
            
         case "WHITE":
            
            System.out.println("You are a pure person!");
            break;

         case "RED":
            
            System.out.println("You are fun and outgoing!");
            break;  
            
         case "BLUE":
            
            System.out.println("You're not a Chelsea fan, are you?");
            break;
            
      }
   }
}
