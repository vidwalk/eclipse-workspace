import java.util.Scanner;

public class ClockTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Clock clock = new Clock(13, 24, 34);
      System.out.println("The 24 format time is: " + clock.toString());
      clock.set12HourFormat();
      System.out.println("The 12 format time is: " + clock.toString());
      clock.tic();
      System.out.println("The time after a tic: " + clock.toString());
      clock.set(16, 60, 2);
      System.out.println("The 12 format time after being changed is: " + clock.toString());
      scan.close();
   }

}
