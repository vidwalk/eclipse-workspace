import java.util.Scanner;
public class JobTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your title?");
      String title = scan.nextLine();
      System.out.println("What is your salary");
      double salary = scan.nextDouble();
      Job job = new Job(title, salary);
      System.out.println("What is the name of the new employee?");
      scan.nextLine();
      String e = scan.nextLine();
      job.hire(e);
      System.out.println("The emplyee is " + job.employee);
      System.out.println("We should fire him");
      job.fire();
      System.out.println("The employee is " + job.employee);
      scan.close();
   }

}
