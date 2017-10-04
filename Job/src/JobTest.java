import java.util.Scanner;
public class JobTest
{

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your birthday?");
      int d =scan.nextInt();
      int m = scan.nextInt();
      int y = scan.nextInt();
      MyDate birthday = new MyDate(m,d,y);
      System.out.println("What is your name?");
      scan.nextLine();
      String name = scan.nextLine();
      Person person = new Person(name, birthday);
      System.out.println("What is your title?");
      String title = scan.nextLine();
      System.out.println("What is your salary?");
      double salary = scan.nextDouble();
      Job job1 = new Job(title, salary, person);
      Job job2 = new Job(title, salary);
      System.out.println("Hire the person");
      job2.hire(person);
      System.out.println("Is the job place available? " + job2.isAvailable());
      System.out.println("Fire the person");
      job2.fire();
      System.out.println("Hire the person back. Are the jobs equal?");
      job2.hire(person);
      System.out.println(job1.equals(job2));
      System.out.println("Set a different salary for the first job");
      double salary2 = scan.nextDouble();
      job1.setSalary(salary2);
      System.out.println(job1.toString());
      scan.close();
   }

}
