
public class Job
{
   String title;
   double salary;
   String employee;
   
   public Job(String title, double salary)
   {
      employee = null;
   }
   public String getTitle()
   {
      return title;
   }
   public double getSalary()
   {
      return salary;
   }
   public String getEmployee()
   {
      return employee;
   }
   public void setSalary(double s)
   {
      salary = s;
   }
   public boolean isAvailable()
   {
      if(employee == null)
         return true;
      return false;
   }
   public void hire(String e)
   {
      if(isAvailable())
      {
         employee = e;
      }
   }
   public void fire()
   {
      employee = null;
   }
}
