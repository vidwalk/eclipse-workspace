
public class Job
{
   String title;
   double salary;
   Person employee;
   public Job(String title, double salary, Person employee)
   {
      this.title = title;
      this.salary= salary;
      this.employee = employee;
   }
   
   public Job(String title, double salary)
   {
      this.title = title;
      this.salary= salary;
      this.employee = null;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   
   public boolean isAvailable()
   {
      if(this.employee == null)
         return true;
      return false;
   }
   
   public void hire(Object object)
   {  
      if (object instanceof Person)
      {  Person obj = (Person) object;
         if(isAvailable()) 
         {
            this.employee = obj;
         }
      }
   }
   
   public void fire()
   {
      this.employee = null;
   }
   
   public String toString() {
      String result = "";
      result = result + this.title;     
      result = result + " " + this.salary;
      result = result + " " + this.employee.toString();
      return result;
   }
   
   public boolean equals(Object object)
   {
      if (!(object instanceof Job))
      {
         return false;
      }
      Job obj = (Job) object;
      if(this.title.equals(obj.title) && this.employee.equals(obj.employee) && this.salary == obj.salary)
         return true;
      return false;
   }
}
