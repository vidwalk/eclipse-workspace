import java.util.Scanner;

public class else_If_Age
{
   public static void main(String[] args)
   {
      int age = 0;
      Scanner scan = new Scanner(System.in);
      age = scan.nextInt();
      if (age == 0)
         System.out.println("Error in age value");
      else if (age > 0 && age <= 12)
         System.out.println("You are a child");
      else if (age > 12 && age <= 19)
         System.out.println("You are a teenager");
      else if (age > 19 && age <= 65)
         System.out.println("You are an adult");
      else if (age > 65)
         System.out.println("You are a senior citizen");
   }
}
