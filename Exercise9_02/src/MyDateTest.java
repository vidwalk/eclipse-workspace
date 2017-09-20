import java.util.Scanner;

public class MyDateTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your date of birth? ");
      System.out.println("Day: ");
      int day = scan.nextInt();
      System.out.println("Month: ");
      int month = scan.nextInt();
      System.out.println("Year: ");
      int year = scan.nextInt();
      MyDate mydate = new MyDate(month, day, year);
      System.out.println("Have you entered your date correctly?(y for yes");
      scan.nextLine();
      String answer = scan.nextLine();
      answer.toLowerCase();
      if (mydate.answerTo(answer))
      {
         System.out.println("Day: ");
         day = scan.nextInt();
         System.out.println("Month: ");
         month = scan.nextInt();
         System.out.println("Year: ");
         year = scan.nextInt();
         mydate.set(month, day, year);
      }

      mydate.tostring();
      scan.close();
   }

}
