import java.util.Scanner;

public class GradeConversion
{  public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   int grade = scan.nextInt();
   switch(grade)
   {
      case -3:
         System.out.println("F");
         break;
      case 0:
         System.out.println("Fx");
         break;
      case 2:
         System.out.println("E");
         break;
      case 4:
         System.out.println("D");
         break;
      case 7:
         System.out.println("C");
         break;
      case 10:
         System.out.println("B");
         break;
      case 12:
         System.out.println("A");
         break;
      default:
         System.out.println("Invalid input");
         break;
         
   }
   }
}
