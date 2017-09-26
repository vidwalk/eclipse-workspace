import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
      /*
       * System.out.println("Have you entered your date correctly?(y for yes");
       * scan.nextLine(); String answer = scan.nextLine(); answer.toLowerCase();
       * if (mydate.answerTo(answer)) { System.out.println("Day: "); day =
       * scan.nextInt(); System.out.println("Month: "); month = scan.nextInt();
       * System.out.println("Year: "); year = scan.nextInt(); mydate.set(month,
       * day, year); } mydate.toString();
       * System.out.println("What is the name of the month? "); String nameMonth
       * = scan.nextLine(); nameMonth = nameMonth.toLowerCase();
       * while(MyDate.convertToMonthNumber(nameMonth) == 0) {
       * System.out.println("Please input the month again"); nameMonth =
       * scan.nextLine(); nameMonth = nameMonth.toLowerCase();
       * System.out.println("Input month: " + nameMonth); }
       * if(MyDate.convertToMonthNumber(nameMonth) < 10) {
       * System.out.println("This is the month number: " + "0" +
       * MyDate.convertToMonthNumber(nameMonth)); } else {
       * System.out.println("This is the month number: " +
       * MyDate.convertToMonthNumber(nameMonth)); }
       * System.out.println("Enter another date");
       * System.out.println("What is your date of birth? ");
       * System.out.println("Day: "); day = scan.nextInt();
       * System.out.println("Month name(String): "); scan.nextLine(); String
       * stringMonth = scan.nextLine(); System.out.println("Year: "); year =
       * scan.nextInt(); mydate.set(day, stringMonth, year); mydate.toString();
       * System.out.println("What is another date of birth? ");
       * System.out.println("Day: "); day = scan.nextInt();
       * System.out.println("Month: "); month = scan.nextInt();
       * System.out.println("Year: "); year = scan.nextInt(); MyDate mydate2 =
       * new MyDate(month, day, year);
       * System.out.println("Are the dates equal? ");
       * System.out.println(mydate.equals(mydate2)); mydate.set(month, day,
       * year); MyDate copydate = mydate.copy(); copydate.toString();
       */
      System.out.println("Is it a leap year?" + mydate.isLeapYear());
      System.out.println(
            "How many days in birth month? " + mydate.numberOfDaysInMonth());
      System.out
            .println("What is the name of the month? " + mydate.getMonthName());
      mydate.stepForwardOneDay();
      System.out.println("What is the next day? ");
      mydate.toString();
      System.out.println("How many days do you want to step forward? ");
      int forwardDays = scan.nextInt();
      System.out.println("What is the day now? ");
      mydate.stepForward(forwardDays);
      mydate.toString();
      Calendar now = GregorianCalendar.getInstance();
      System.out.println("Day = " + now.get(Calendar.DAY_OF_MONTH));
      System.out.println("Month = " + (now.get(Calendar.MONTH) + 1));
      System.out.println("Year = " + now.get(Calendar.YEAR));
      scan.close();
   }

}
