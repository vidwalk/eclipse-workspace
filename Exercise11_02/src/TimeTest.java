import java.util.Scanner;

public class TimeTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int timeInSeconds = scan.nextInt();
      Time time = new Time(timeInSeconds);
      System.out.println("The seconds converted to time: " + time.hour + ":" + time.minute + ":" + time.second);
      time = new Time(10, 20, 45);
      System.out.println(time.toString());
      System.out.println("The time in seconds is: " + time.getTimeInSeconds());
      scan.close();
   }

}
