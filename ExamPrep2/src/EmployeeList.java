import java.util.Arrays;

public class EmployeeList
{
   private int size;
   private Employee[] employee;

   public EmployeeList(int maxNumberOfEmployees)
   {
      this.size = maxNumberOfEmployees;
      employee = new Employee[this.size];
   }

   public void addEmployee(Employee employee)
   {
      boolean ok = false;
      for (int i = 0; i <= size && ok == false; i++)
      {
         if (this.employee[i] != null)
         {
            this.employee[i] = employee;
            ok = true;
         }
      }
   }

   public void removeEmployee(Employee employee)
   {
      boolean ok = false;
      for (int i = 0; i <= size && ok == false; i++)
      {
         if (this.employee[i].equals(employee))
         {
            this.employee[i] = null;
            ok = true;
         }
      }
   }

   public int getNumberOfEmployees()
   {
      return size;
   }

   public Employee[] getAllEmployees()
   {
      return employee;
   }

   public double getTotalEarningsPerWeek()
   {
      double sum = 0;
      for (int i = 0; i <= size; i++)
         sum = sum + employee[i].earningsPerWeek();
      return sum;
   }

   public String toString()
   {
      return "EmployeeList [size=" + size + ", employee="
            + Arrays.toString(employee) + "]";
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof EmployeeList))
         return false;
      EmployeeList copy = (EmployeeList) obj;
      if (copy.getNumberOfEmployees() == size)
      {
         for (int i = 0; i <= size; i++)
            if (copy.getAllEmployees()[i] != employee[i])
               return false;
         return true;
      }
      return false;
   }
}
