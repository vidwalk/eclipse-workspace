import java.util.Scanner;

public class myZurpToMyGazurp
{
   public static void main(String[] args)
   {
      int month;
      String a = "Zurp", b = "Gazurp";
      if (a.equals(b)) // equalsIgnoreCase
         System.out.println("Zurrp");
      else
         System.out.println("No Zurp :(");
      if (a.compareTo(b) > 0) // compareToIgnoreCase
         System.out.println("Gazurp");
      else
         System.out.println("No Gazurp");
      Scanner scanner = new Scanner(System.in);
      month = scanner.nextInt();
      switch (month)
      {
         case 1:
            System.out.println("January");
            break;
         case 2:
            
            System.out.println("February");
            break;
            
         case 3:
            System.out.println("March");
            break;
            
         case 4:
            System.out.println("Aprik");
            break;
            
         case 5:
            System.out.println("May");
            break;
            
         case 6:
            System.out.println("June");
            break;
            
         case 7:
            System.out.println("July");
            break;
            
         case 8:
            System.out.println("August");
            break;
            
         case 9:
            System.out.println("September");
            break;
            
         case 10:
            System.out.println("October");
            break;
            
         case 11:
            System.out.println("November");
            break;
            
         case 12:
            System.out.println("December");
            break;
            
         default:
            System.out.println("Error! Invalid numbah");
            break;
      }
   }
}
