import java.util.Scanner;
public class CakeTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the weight of the cake? ");
      double weight = scan.nextDouble();
      while(weight<=0)
      {
         System.out.println("Input the weight again");
         weight = scan.nextDouble();
      }
      scan.nextLine();
      System.out.println("What is the name of the cake?");
      String name = scan.nextLine();
      Cake cake1 = new Cake(name, weight);
      Cake cake2 = new Cake(name,weight);
      while(!cake1.isCakeGone())
      {
         System.out.println("How much do you want to eat(g,% then quantity)");
         String string =scan.nextLine();
         double quantity = scan.nextDouble();
         scan.nextLine();
         cake1.eat(quantity, string.charAt(0));
      }
      System.out.println("You've eaten all the " + cake1.getName() + " cake");
      
      Cake rumball = Cake.makeRumBall(cake1, cake2);
      
      while(!rumball.isCakeGone())
      {
         System.out.println("How much do you want to eat(g,% then quantity)");
         String string =scan.nextLine();
         double quantity = scan.nextDouble();
         scan.nextLine();
         rumball.eat(quantity, string.charAt(0));
      }
      System.out.println("You've eaten all the " + rumball.getName() + " cake");
   }

}
